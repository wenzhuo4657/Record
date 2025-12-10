package cn.wenzhuo4657.dailyWeb.infrastructure.database.entity;

import java.io.Serializable;

/**
 * (NotifierType)实体类
 *
 * @author makejava
 * @since 2025-11-10 13:41:14
 */
public class NotifierType implements Serializable {
    private static final long serialVersionUID = 858588409541034480L;

    private Long id;

    private Long typeId;

    private String name;

    private String des;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
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

}

