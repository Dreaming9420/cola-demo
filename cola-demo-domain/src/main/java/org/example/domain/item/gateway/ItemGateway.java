package org.example.domain.item.gateway;

import org.example.domain.item.entity.ItemEntity;

public interface ItemGateway {

    void save(ItemEntity itemEntity);

    ItemEntity getById(Long id);

    void update(ItemEntity itemEntity);
}
