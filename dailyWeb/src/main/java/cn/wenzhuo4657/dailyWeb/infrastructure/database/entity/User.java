package cn.wenzhuo4657.dailyWeb.infrastructure.database.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2025-11-10 13:41:15
 */
public class User implements Serializable {
    private static final long serialVersionUID = 202532437837927539L;

    private Long id;

    private Long userId;

    private String oauthUserid;

    private String oauthProvider;

    private String createdAt;

    private String name;

    private String avatarUrl;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOauthUserid() {
        return oauthUserid;
    }

    public void setOauthUserid(String oauthUserid) {
        this.oauthUserid = oauthUserid;
    }

    public String getOauthProvider() {
        return oauthProvider;
    }

    public void setOauthProvider(String oauthProvider) {
        this.oauthProvider = oauthProvider;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

}

