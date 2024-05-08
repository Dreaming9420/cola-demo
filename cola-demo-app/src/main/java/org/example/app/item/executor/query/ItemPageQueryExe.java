package org.example.app.item.executor.query;

import com.alibaba.cola.dto.PageResponse;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.commons.lang3.StringUtils;
import org.example.app.item.assembler.ItemAssembler;
import org.example.client.item.dto.clientobject.ItemCO;
import org.example.client.item.dto.cmd.query.ItemPageQuery;
import org.example.infrastructure.common.util.PageUtil;
import org.example.infrastructure.item.gatewayimpl.database.dataobject.ItemDO;
import org.example.infrastructure.item.gatewayimpl.database.mapper.ItemMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ItemPageQueryExe {

    @Resource
    private ItemMapper itemMapper;

    public PageResponse<ItemCO> execute(ItemPageQuery query) {
        Page<ItemDO> page = Page.of(query.getPageIndex(), query.getPageSize());
        LambdaQueryWrapper<ItemDO> queryWrapper = Wrappers.lambdaQuery(ItemDO.class)
                .like(StringUtils.isNotBlank(query.getItemName()), ItemDO::getItemName, query.getItemName());
        return PageUtil.toColaPageResponse(itemMapper.selectPage(page, queryWrapper), ItemAssembler::toCO);
    }
}
