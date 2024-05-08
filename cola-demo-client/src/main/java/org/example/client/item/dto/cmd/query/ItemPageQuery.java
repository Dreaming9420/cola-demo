package org.example.client.item.dto.cmd.query;

import com.alibaba.cola.dto.PageQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ItemPageQuery extends PageQuery {

    /**
     * 商品名称
     */
    private String itemName;
}
