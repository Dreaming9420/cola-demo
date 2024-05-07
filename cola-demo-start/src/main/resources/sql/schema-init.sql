# CREATE DATABASE if not exists test
#     CHARACTER SET utf8mb4
#     COLLATE utf8mb4_bin;
#
# use test;

CREATE TABLE IF NOT EXISTS item
(
    id           BIGINT AUTO_INCREMENT COMMENT '主键'
        PRIMARY KEY,
    item_name    VARCHAR(255)                               NOT NULL COMMENT '商品名称',
    introduction TEXT                                       NULL COMMENT '介绍',
    sale_price   BIGINT UNSIGNED  DEFAULT '0'               NOT NULL COMMENT '售价(单位：分)',
    is_deleted   TINYINT UNSIGNED DEFAULT '1'               NOT NULL COMMENT '逻辑删除字段(0：已删除；1：未删除)',
    create_time  DATETIME         DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
    update_time  DATETIME         DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT '商品表';

CREATE TABLE IF NOT EXISTS `order`
(
    id          BIGINT AUTO_INCREMENT COMMENT '主键'
        PRIMARY KEY,
    user_id     BIGINT                                     NOT NULL COMMENT '用户id',
    order_no    VARCHAR(64)                                NOT NULL COMMENT '订单号',
    pay_amount  BIGINT UNSIGNED                            NULL COMMENT '实际支付金额(单位：分)',
    is_deleted  TINYINT UNSIGNED DEFAULT '1'               NOT NULL COMMENT '逻辑删除字段(0：已删除；1：未删除)',
    create_time DATETIME         DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
    update_time DATETIME         DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    UNIQUE uk_order_no (order_no),
    INDEX idx_user_id (user_id)
) COMMENT '订单表';

CREATE TABLE IF NOT EXISTS order_item
(
    id          BIGINT AUTO_INCREMENT COMMENT '主键'
        PRIMARY KEY,
    order_id    BIGINT                                     NOT NULL COMMENT '订单id',
    order_no    VARCHAR(64)                                NOT NULL COMMENT '订单号',
    item_id     BIGINT                                     NOT NULL COMMENT '商品id',
    item_name   VARCHAR(255)                               NOT NULL COMMENT '商品名称',
    item_price  BIGINT UNSIGNED  DEFAULT '0'               NOT NULL COMMENT '商品单价(单位：分)',
    quantity    INT UNSIGNED     DEFAULT '0'               NOT NULL COMMENT '数量',
    is_deleted  TINYINT UNSIGNED DEFAULT '1'               NOT NULL COMMENT '逻辑删除字段(0：已删除；1：未删除)',
    create_time DATETIME         DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
    update_time DATETIME         DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    INDEX idx_order_id (order_id),
    INDEX idx_item_id (item_id)
) COMMENT '订单商品表';