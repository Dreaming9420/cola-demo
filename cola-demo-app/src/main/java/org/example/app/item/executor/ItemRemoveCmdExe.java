package org.example.app.item.executor;

import com.alibaba.cola.dto.Response;
import org.example.infrastructure.item.gatewayimpl.database.mapper.ItemMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ItemRemoveCmdExe {

    @Resource
    private ItemMapper itemMapper;

    public Response execute(Long id) {
        itemMapper.deleteById(id);
        return Response.buildSuccess();
    }
}
