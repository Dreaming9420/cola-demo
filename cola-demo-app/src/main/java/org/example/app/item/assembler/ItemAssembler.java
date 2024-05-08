package org.example.app.item.assembler;

import org.example.client.item.dto.clientobject.ItemCO;
import org.example.client.item.dto.cmd.ItemAddCmd;
import org.example.client.item.dto.cmd.ItemUpdateCmd;
import org.example.domain.item.entity.ItemEntity;
import org.example.infrastructure.item.gatewayimpl.database.dataobject.ItemDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

public class ItemAssembler {

    @Mapper
    public interface ItemAssemblerMapper {
        ItemAssemblerMapper INSTANCE = Mappers.getMapper(ItemAssemblerMapper.class);

        ItemCO toCO(ItemEntity itemEntity);

        ItemCO toCO(ItemDO itemDO);

        ItemEntity toEntity(ItemAddCmd addCmd);

        ItemEntity toEntity(ItemUpdateCmd updateCmd);
    }

    public static ItemCO toCO(ItemEntity itemEntity) {
        return ItemAssemblerMapper.INSTANCE.toCO(itemEntity);
    }

    public static ItemCO toCO(ItemDO itemDO) {
        return ItemAssemblerMapper.INSTANCE.toCO(itemDO);
    }

    public static ItemEntity toEntity(ItemAddCmd addCmd) {
        return ItemAssemblerMapper.INSTANCE.toEntity(addCmd);
    }

    public static ItemEntity toEntity(ItemUpdateCmd updateCmd) {
        return ItemAssemblerMapper.INSTANCE.toEntity(updateCmd);
    }
}
