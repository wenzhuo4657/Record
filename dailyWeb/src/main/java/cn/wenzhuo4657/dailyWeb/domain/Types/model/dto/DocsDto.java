package cn.wenzhuo4657.dailyWeb.domain.Types.model.dto;

public class DocsDto {

    private Long id;

    private String name;


    public DocsDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DocsDto() {
    }

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
}
