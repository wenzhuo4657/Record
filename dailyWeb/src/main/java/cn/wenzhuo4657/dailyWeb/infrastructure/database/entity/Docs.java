package cn.wenzhuo4657.dailyWeb.infrastructure.database.entity;

import java.io.Serializable;

/**
 * (Docs)实体类
 *
 * @author makejava
 * @since 2025-11-10 13:41:14
 */
public class Docs implements Serializable {
    private static final long serialVersionUID = -26464799115145196L;

    private Long id;

    private String name;

    private Long typeId;

    private String createTime;

    private String updateTime;

    private Long docsId;

    private Long userId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Long getDocsId() {
        return docsId;
    }

    public void setDocsId(Long docsId) {
        this.docsId = docsId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
