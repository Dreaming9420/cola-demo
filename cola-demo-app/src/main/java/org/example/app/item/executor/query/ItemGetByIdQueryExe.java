package org.example.app.item.executor.query;

import com.alibaba.cola.dto.SingleResponse;
import org.example.app.item.assembler.ItemAssembler;
import org.example.client.item.dto.clientobject.ItemCO;
import org.example.infrastructure.item.gatewayimpl.database.dataobject.ItemDO;
import org.example.infrastructure.item.gatewayimpl.database.mapper.ItemMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class ItemGetByIdQueryExe {

    @Resource
    private ItemMapper itemMapper;

    public SingleResponse<ItemCO> execute(Long id) {
        ItemDO itemDO = itemMapper.selectById(id);
        return SingleResponse.of(ItemAssembler.toCO(itemDO));
    }
}
