package org.example.client.item.api;

import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import org.example.client.item.dto.clientobject.ItemCO;
import org.example.client.item.dto.cmd.ItemAddCmd;
import org.example.client.item.dto.cmd.ItemUpdateCmd;
import org.example.client.item.dto.cmd.query.ItemPageQuery;

public interface ItemServiceI {

    /**
     * 根据id获取商品信息
     * @param id 商品id
     * @return {@link SingleResponse }<{@link ItemCO }>
     */
    SingleResponse<ItemCO> getById(Long id);

    /**
     * 分页查询
     * @param query 查询
     * @return {@link PageResponse }<{@link ItemCO }>
     */
    PageResponse<ItemCO> pageQuery(ItemPageQuery query);

    /**
     * 添加商品
     * @param addCmd 添加cmd
     * @return {@link Response }
     */
    Response add(ItemAddCmd addCmd);

    /**
     * 编辑商品
     * @param updateCmd 更新cmd
     * @return {@link Response }
     */
    Response update(ItemUpdateCmd updateCmd);

    /**
     * 删除商品
     */
    Response remove(Long id);
}
