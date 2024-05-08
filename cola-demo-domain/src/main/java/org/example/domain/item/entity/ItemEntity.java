package org.example.domain.item.entity;

import com.alibaba.cola.domain.Entity;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class ItemEntity {

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

    /**
     * 逻辑删除字段(0：已删除；1：未删除)
     */
    private Integer isDeleted;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

}
