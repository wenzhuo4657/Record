package cn.wenzhuo4657.dailyWeb.domain.ItemEdit.strategy.function;

import cn.wenzhuo4657.dailyWeb.domain.ItemEdit.model.vo.DocsItemType;

import java.util.Map;


@FunctionalInterface
public interface FieldFn {
    String toField(DocsItemType.ItemType itemType, Map<String,String> map)throws ClassNotFoundException;
}
