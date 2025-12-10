package cn.wenzhuo4657.dailyWeb.infrastructure.database.entity;

import java.io.Serializable;

/**
 * (DocsItem)实体类
 *
 * @author makejava
 * @since 2025-11-10 13:41:14
 */
public class DocsItem implements Serializable {
    private static final long serialVersionUID = -16086469790491786L;

    private Long id;

    private Long index;

    private Long docsId;

    private String itemContent;

    private String itemField;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public Long getDocsId() {
        return docsId;
    }

    public void setDocsId(Long docsId) {
        this.docsId = docsId;
    }

    public String getItemContent() {
        return itemContent;
    }

    public void setItemContent(String itemContent) {
        this.itemContent = itemContent;
    }

    public String getItemField() {
        return itemField;
    }

    public void setItemField(String itemField) {
        this.itemField = itemField;
    }
}

