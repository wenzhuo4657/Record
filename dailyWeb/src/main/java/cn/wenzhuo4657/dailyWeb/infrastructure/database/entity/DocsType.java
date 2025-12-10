package cn.wenzhuo4657.dailyWeb.infrastructure.database.entity;

import java.io.Serializable;

/**
 * (DocsType)实体类
 *
 * @author makejava
 * @since 2025-11-10 13:41:14
 */
public class DocsType implements Serializable {
    private static final long serialVersionUID = 384328872257298043L;

    private Long id;

    private String name;

    private String des;

    private Long typeId;


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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

}

