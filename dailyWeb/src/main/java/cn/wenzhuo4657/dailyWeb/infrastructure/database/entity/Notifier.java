package cn.wenzhuo4657.dailyWeb.infrastructure.database.entity;

import java.io.Serializable;

/**
 * (Notifier)实体类
 *
 * @author makejava
 * @since 2025-11-10 18:17:09
 */
public class Notifier implements Serializable {
    private static final long serialVersionUID = 334212465223081884L;

    private Long id;

    private Long userId;

    private Long notifierTypeId;

    private String name;

    private String configJson;

    private Long notifierId;


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

    public Long getNotifierTypeId() {
        return notifierTypeId;
    }

    public void setNotifierTypeId(Long notifierTypeId) {
        this.notifierTypeId = notifierTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConfigJson() {
        return configJson;
    }

    public void setConfigJson(String configJson) {
        this.configJson = configJson;
    }

    public Long getNotifierId() {
        return notifierId;
    }

    public void setNotifierId(Long notifierId) {
        this.notifierId = notifierId;
    }

}

