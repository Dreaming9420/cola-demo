package org.example.infrastructure.item.convertor;

import org.example.domain.item.entity.ItemEntity;
import org.example.infrastructure.item.gatewayimpl.database.dataobject.ItemDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

public class ItemConvertor {

    @Mapper
    public interface ItemConvertorMapper {
        ItemConvertorMapper INSTANCE = Mappers.getMapper(ItemConvertorMapper.class);

        ItemEntity toEntity(ItemDO itemDO);

        ItemDO toDO(ItemEntity itemEntity);
    }

    public static ItemEntity toEntity(ItemDO itemDO) {
        return ItemConvertorMapper.INSTANCE.toEntity(itemDO);
    }

    public static ItemDO toDO(ItemEntity itemEntity) {
        return ItemConvertorMapper.INSTANCE.toDO(itemEntity);
    }
}
