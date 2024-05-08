package org.example.client.item.dto.cmd;

import com.alibaba.cola.dto.Command;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@EqualsAndHashCode(callSuper = true)
@Data
public class ItemAddCmd extends Command {

    /**
     * 商品名称
     */
    @NotBlank(message = "商品名称不能为空")
    @Max(value = 20, message = "商品名称不能超过20个字符")
    private String itemName;

    /**
     * 介绍
     */
    private String introduction;

    /**
     * 成本价(单位：分)
     */
    @NotNull(message = "成本价不能为空")
    @PositiveOrZero(message = "成本价不能小于0")
    private Long costPrice;

    /**
     * 售价(单位：分)
     */
    @NotNull(message = "售价不能为空")
    @PositiveOrZero(message = "售价不能小于0")
    private Long salePrice;
}
