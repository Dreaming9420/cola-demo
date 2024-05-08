package org.example.app.item.executor;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.exception.Assert;
import org.example.app.item.assembler.ItemAssembler;
import org.example.app.item.validator.ItemValidator;
import org.example.client.item.dto.cmd.ItemUpdateCmd;
import org.example.domain.item.entity.ItemEntity;
import org.example.domain.item.gateway.ItemGateway;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ItemUpdateCmdExe {

    @Resource
    private ItemGateway itemGateway;

    public Response execute(ItemUpdateCmd updateCmd) {
        Assert.notNull(itemGateway.getById(updateCmd.getId()), "商品不存在");
        // 转换为entity
        ItemEntity itemEntity = ItemAssembler.toEntity(updateCmd);
        // 校验
        ItemValidator.validate(itemEntity);
        // 更新
        itemGateway.update(itemEntity);
        return Response.buildSuccess();
    }
}
