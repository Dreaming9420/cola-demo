package org.example.client.item.dto.clientobject;

import com.alibaba.cola.dto.ClientObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ItemCO extends ClientObject {

    /**
     * 主键
     */
    private Long id;

    /**
     * 商品名称
     */
    private String itemName;

    /**
     * 介绍
     */
    private String introduction;

    /**
     * 成本价(单位：分)
     */
    private Long costPrice;

    /**
     * 售价(单位：分)
     */
    private Long salePrice;
}
