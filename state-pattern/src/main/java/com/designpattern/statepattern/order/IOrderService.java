package com.designpattern.statepattern.order;

import java.util.Map;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public interface IOrderService {
    /**
     * 创建订单
     * @return
     */
    Order create();

    /**
     * 发起支付
     * @return
     */
    Order pay(int id);

    /**
     * 订单发货
     * @return
     */
    Order deliver(int id);

    /**
     * 订单收货
     * @return
     */
    Order receive(int id);

    Map<Integer, Order> getOrders();
}
