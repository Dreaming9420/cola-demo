package org.example.adapter.web;


import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import org.example.client.item.api.ItemServiceI;
import org.example.client.item.dto.clientobject.ItemCO;
import org.example.client.item.dto.cmd.ItemAddCmd;
import org.example.client.item.dto.cmd.ItemUpdateCmd;
import org.example.client.item.dto.cmd.query.ItemPageQuery;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 商品相关
 */
@RestController
@RequestMapping("/item")
public class ItemController {

    @Resource
    private ItemServiceI itemService;

    /**
     * 根据id获取商品信息
     */
    @GetMapping("/getById/{id}")
    public SingleResponse<ItemCO> getById(@PathVariable Long id) {
        return itemService.getById(id);
    }

    /**
     * 分页查询
     */
    @GetMapping("/pageQuery")
    public PageResponse<ItemCO> pageQuery(ItemPageQuery query) {
        return itemService.pageQuery(query);
    }

    /**
     * 新增商品
     */
    @PostMapping("/add")
    public Response add(@Valid @RequestBody ItemAddCmd addCmd) {
        return itemService.add(addCmd);
    }

    /**
     * 编辑商品
     */
    @PutMapping("/update")
    public Response update(@Valid @RequestBody ItemUpdateCmd updateCmd) {
        return itemService.update(updateCmd);
    }

    /**
     * 删除商品
     */
    @DeleteMapping("/remove/{id}")
    public Response remove(@PathVariable Long id) {
        return itemService.remove(id);
    }
}
