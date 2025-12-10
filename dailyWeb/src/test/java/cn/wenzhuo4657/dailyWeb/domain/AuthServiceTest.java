package cn.wenzhuo4657.dailyWeb.domain;


import cn.wenzhuo4657.dailyWeb.domain.auth.UserService;
import cn.wenzhuo4657.dailyWeb.domain.auth.model.dto.RegisterByOauthDto;
import cn.wenzhuo4657.dailyWeb.domain.auth.model.dto.UserDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthServiceTest {

    Logger logger = org.slf4j.LoggerFactory.getLogger(AuthServiceTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void testLogin() {
        RegisterByOauthDto registerByOauthDto = new RegisterByOauthDto();
        registerByOauthDto.setOauth_provider("github");
        registerByOauthDto.setOauth_provider_username("wenzhuo4657");
        registerByOauthDto.setOauth_provider_avatar("https://");
        registerByOauthDto.setOauth_provider_user_id("xxx");
        UserDto dto = userService.registerByOauth(registerByOauthDto);
        logger.info("dto: {}", dto);
    }
}
