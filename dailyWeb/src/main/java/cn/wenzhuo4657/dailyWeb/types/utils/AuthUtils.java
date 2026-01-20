package cn.wenzhuo4657.dailyWeb.types.utils;

import cn.dev33.satoken.stp.StpUtil;
import cn.wenzhuo4657.dailyWeb.domain.auth.model.dto.UserDto;
import io.jsonwebtoken.Claims;
import jakarta.servlet.http.HttpServletRequest;

/**
 *  登录身份工具类：隔绝框架层影响，如果后续更换权限框架，只改它就好了，
 *
 */
public class AuthUtils {

    /**
     * 获取登录用户的id
     * @param httpRequest HTTP请求对象
     * @return 用户ID
     * todo 这里必须要么存在access_token，要么存在refresh_token，否则异常就会报错500，这不合理
     */
    public static Long getLoginId(HttpServletRequest httpRequest){

        String accessToken = httpRequest.getHeader("access_token").replace("Bearer ", "").trim();

        if (accessToken == null || accessToken.isEmpty()|| JwtUtils.isExpired(accessToken)) {
            // 如果没有access_token，回退到Sa-Token
            return Long.valueOf(StpUtil.getLoginId().toString());
        }
        Claims claims = JwtUtils.parsePayload(accessToken);
        return  claims.get("username", Long.class);
    }

    /**
     * 存储用户信息
     */
    public static void setUserInfo(UserDto userInfo){
        StpUtil.getTokenSession().set("userInfo", userInfo);
    }

    /**
     * 获取用户信息
     */
    public static UserDto getUserInfo(){
        return (UserDto) StpUtil.getTokenSession().get("userInfo");
    }

}
