package cn.wenzhuo4657.dailyWeb.tigger.http.dto.res;

import cn.wenzhuo4657.dailyWeb.domain.ItemEdit.model.dto.ItemDto;

import java.util.List;

public class PreViewResponse {


    private List<ItemDto> baseItem;

    private List<ItemDto> planItem;

    public PreViewResponse(List<ItemDto> baseItem, List<ItemDto> planItem) {
        this.baseItem = baseItem;
        this.planItem = planItem;
    }

    public PreViewResponse() {
    }

    public List<ItemDto> getBaseItem() {
        return baseItem;
    }

    public void setBaseItem(List<ItemDto> baseItem) {
        this.baseItem = baseItem;
    }

    public List<ItemDto> getPlanItem() {
        return planItem;
    }

    public void setPlanItem(List<ItemDto> planItem) {
        this.planItem = planItem;
    }
}
