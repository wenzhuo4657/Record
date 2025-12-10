package cn.wenzhuo4657.dailyWeb.domain.ItemEdit.strategy.function;

import cn.wenzhuo4657.dailyWeb.domain.ItemEdit.model.vo.DocsItemType;
import cn.wenzhuo4657.dailyWeb.infrastructure.database.entity.DocsItem;

public interface ExpandFn {
    String apply(DocsItemType.ItemType itemType, DocsItem item) throws ClassNotFoundException;
}
