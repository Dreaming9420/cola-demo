package org.example.app.item.service;

import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import org.example.app.item.executor.ItemAddCmdExe;
import org.example.app.item.executor.ItemRemoveCmdExe;
import org.example.app.item.executor.ItemUpdateCmdExe;
import org.example.app.item.executor.query.ItemGetByIdQueryExe;
import org.example.app.item.executor.query.ItemPageQueryExe;
import org.example.client.item.api.ItemServiceI;
import org.example.client.item.dto.clientobject.ItemCO;
import org.example.client.item.dto.cmd.ItemAddCmd;
import org.example.client.item.dto.cmd.ItemUpdateCmd;
import org.example.client.item.dto.cmd.query.ItemPageQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItemServiceImpl implements ItemServiceI {

    @Resource
    private ItemGetByIdQueryExe itemGetByIdQueryExe;
    @Resource
    private ItemPageQueryExe itemPageQueryExe;
    @Resource
    private ItemAddCmdExe itemAddCmdExe;
    @Resource
    private ItemUpdateCmdExe itemUpdateCmdExe;
    @Resource
    private ItemRemoveCmdExe itemRemoveCmdExe;

    @Override
    public SingleResponse<ItemCO> getById(Long id) {
        return itemGetByIdQueryExe.execute(id);
    }

    @Override
    public PageResponse<ItemCO> pageQuery(ItemPageQuery query) {
        return itemPageQueryExe.execute(query);
    }

    @Override
    public Response add(ItemAddCmd addCmd) {
        return itemAddCmdExe.execute(addCmd);
    }

    @Override
    public Response update(ItemUpdateCmd updateCmd) {
        return itemUpdateCmdExe.execute(updateCmd);
    }

    @Override
    public Response remove(Long id) {
        return itemRemoveCmdExe.execute(id);
    }
}