-- 插入商品表数据
INSERT ignore INTO item (id, item_name, introduction, cost_price, sale_price, create_time, update_time)
VALUES (1, '商品1', '这是商品1的介绍', 5000, 10000, '2024-05-01 10:00:00', '2024-05-01 10:00:00'),
       (2, '商品2', '这是商品2的介绍', 10000, 20000, '2024-05-02 10:00:00', '2024-05-02 10:00:00'),
       (3, '商品3', '这是商品3的介绍', 15000, 30000, '2024-05-03 10:00:00', '2024-05-03 10:00:00');

-- 插入订单表数据
INSERT ignore INTO `order` (id, user_id, order_no, create_time, update_time)
VALUES (1, 1, '2024050110001', '2024-05-01 10:00:00', '2024-05-01 10:00:00'),
       (2, 2, '2024050210002', '2024-05-02 10:00:00', '2024-05-02 10:00:00'),
       (3, 3, '2024050310003', '2024-05-03 10:00:00', '2024-05-03 10:00:00');

-- 插入订单商品表数据
INSERT ignore INTO order_item (id, order_id, order_no, item_id, item_name, item_price, quantity, create_time,
                               update_time)
VALUES (1, 1, '2024050110001', 1, '商品1', 10000, 1, '2024-05-01 10:00:00', '2024-05-01 10:00:00'),
       (2, 1, '2024050110001', 2, '商品2', 20000, 1, '2024-05-01 10:00:00', '2024-05-01 10:00:00'),
       (3, 2, '2024050210002', 2, '商品2', 20000, 2, '2024-05-02 10:00:00', '2024-05-02 10:00:00'),
       (4, 3, '2024050310003', 3, '商品3', 30000, 1, '2024-05-03 10:00:00', '2024-05-03 10:00:00');

-- 更新订单表的pay_amount字段
UPDATE `order` o
    JOIN order_item oi ON o.id = oi.order_id
SET o.pay_amount = (SELECT SUM(oi.item_price * oi.quantity)
                    FROM order_item oi
                    WHERE oi.order_id = o.id);