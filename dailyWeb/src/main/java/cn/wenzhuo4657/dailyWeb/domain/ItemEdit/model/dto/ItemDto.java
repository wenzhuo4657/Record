package cn.wenzhuo4657.dailyWeb.domain.ItemEdit.model.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class ItemDto {

    private  int id;


    @NotNull
    @Min(value = 0)
    private String index;

    @NotNull
    private String title;
    @NotNull
    private String content;

    private String expand; // 额外字段数据，随类型动态变化

    public ItemDto() {
    }

    public ItemDto(String index, String title, String content, String expand) {
        this.index = index;
        this.title = title;
        this.content = content;
        this.expand = expand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }

    @Override
    public String toString() {
        return "ItemDto{" +
                "id=" + id +
                ", index='" + index + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", expand='" + expand + '\'' +
                '}';
    }
}

