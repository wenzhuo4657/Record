package cn.wenzhuo4657.dailyWeb.infrastructure.database.entity;

import java.io.Serializable;

/**
 * (UserAuth)实体类
 *
 * @author makejava
 * @since 2025-11-10 13:41:16
 */
public class UserAuth implements Serializable {
    private static final long serialVersionUID = -49622796500743526L;

    private Long id;

    private Long userId;

    private Long docsTypeId;


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

    public Long getDocsTypeId() {
        return docsTypeId;
    }

    public void setDocsTypeId(Long docsTypeId) {
        this.docsTypeId = docsTypeId;
    }

}

