package org.example.app.item.validator;

import com.alibaba.cola.exception.Assert;
import org.example.domain.item.entity.ItemEntity;

public class ItemValidator {

    public static void validate(ItemEntity itemEntity) {
        Assert.isTrue(itemEntity.getCostPrice() <= itemEntity.getSalePrice(), "售价不能小于成本价");
    }
}
