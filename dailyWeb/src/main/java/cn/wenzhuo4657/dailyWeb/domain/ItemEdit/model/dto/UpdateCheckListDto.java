package cn.wenzhuo4657.dailyWeb.domain.ItemEdit.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class UpdateCheckListDto {

    @NotNull
    @Min(value = 0)
    private Long index;

    @NotNull
    private String title;

    public UpdateCheckListDto() {
    }

    public UpdateCheckListDto(Long id, String title) {
        this.index = id;
        this.title = title;
    }

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

