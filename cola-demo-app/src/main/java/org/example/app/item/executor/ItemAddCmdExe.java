package org.example.app.item.executor;

import com.alibaba.cola.dto.Response;
import org.example.app.item.assembler.ItemAssembler;
import org.example.app.item.validator.ItemValidator;
import org.example.client.item.dto.cmd.ItemAddCmd;
import org.example.domain.item.entity.ItemEntity;
import org.example.domain.item.gateway.ItemGateway;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ItemAddCmdExe {

    @Resource
    private ItemGateway itemGateway;

    public Response execute(ItemAddCmd addCmd) {
        // 转换为entity
        ItemEntity itemEntity = ItemAssembler.toEntity(addCmd);
        // 校验
        ItemValidator.validate(itemEntity);
        // 保存
        itemGateway.save(itemEntity);
        return Response.buildSuccess();
    }
}
