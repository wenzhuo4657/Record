package cn.wenzhuo4657.dailyWeb.domain.auth;

import cn.wenzhuo4657.dailyWeb.domain.auth.model.aggregate.CheckUserByOauthAggregate;
import cn.wenzhuo4657.dailyWeb.domain.auth.model.aggregate.RegisterAggregate;
import cn.wenzhuo4657.dailyWeb.domain.auth.model.dto.RegisterByOauthDto;
import cn.wenzhuo4657.dailyWeb.domain.auth.model.dto.UserDto;
import cn.wenzhuo4657.dailyWeb.domain.auth.repository.IAuthRepository;
import cn.wenzhuo4657.dailyWeb.infrastructure.database.entity.User;
import cn.wenzhuo4657.dailyWeb.types.utils.SnowflakeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class UserService  implements IUserService {


    @Autowired
    private IAuthRepository authRepository;

    @Override
    public UserDto registerByOauth(RegisterByOauthDto registerByOauthDto) {
        CheckUserByOauthAggregate check = new CheckUserByOauthAggregate(registerByOauthDto.getOauth_provider(), registerByOauthDto.getOauth_provider_user_id());


        User userEntity = authRepository.checkUserExists(check);
        if (userEntity ==null){
            RegisterAggregate aggregate=new RegisterAggregate();
            User userDto=new User();
            userDto.setName(registerByOauthDto.getOauth_provider_username());
            userDto.setUserId(SnowflakeUtils.getSnowflakeId());
            userDto.setAvatarUrl(registerByOauthDto.getOauth_provider_avatar());
            userDto.setOauthUserid(registerByOauthDto.getOauth_provider_user_id());
            userDto.setOauthProvider(registerByOauthDto.getOauth_provider());
            aggregate.setUser(userDto);
            userEntity=authRepository.initUser(aggregate);
        }

        UserDto dto=new UserDto();
        dto.setUsername(userEntity.getName());
        dto.setAvatar(userEntity.getAvatarUrl());
        dto.setId(userEntity.getUserId());
        return dto;
    }


}
