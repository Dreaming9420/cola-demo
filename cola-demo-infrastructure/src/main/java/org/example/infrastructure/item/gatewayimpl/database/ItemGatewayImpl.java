package org.example.infrastructure.item.gatewayimpl.database;

import org.example.domain.item.entity.ItemEntity;
import org.example.domain.item.gateway.ItemGateway;
import org.example.infrastructure.item.convertor.ItemConvertor;
import org.example.infrastructure.item.gatewayimpl.database.mapper.ItemMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ItemGatewayImpl implements ItemGateway {

    @Resource
    private ItemMapper itemMapper;

    @Override
    public void save(ItemEntity itemEntity) {
        itemMapper.insert(ItemConvertor.toDO(itemEntity));
    }

    @Override
    public ItemEntity getById(Long id) {
        return ItemConvertor.toEntity(itemMapper.selectById(id));
    }

    @Override
    public void update(ItemEntity itemEntity) {
        itemMapper.updateById(ItemConvertor.toDO(itemEntity));
    }
}
