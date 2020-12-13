package com.designpattern.statepattern.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.persist.StateMachinePersister;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
@Service("orderService")
public class OrderServiceImpl implements IOrderService {

    @Resource
    private StateMachine<OrderStatus, OrderStatusChangeEvent> stateMachine;
    @Autowired
    private StateMachinePersister<OrderStatus, OrderStatusChangeEvent, Order> persister;

    private int id = 1;
    private Map<Integer, Order> orderMap = new HashMap<>();


    @Override
    public Order create() {
        Order order = new Order();
        order.setId(id ++);
        order.setOrderStatus(OrderStatus.WAIT_PAYMENT);
        orderMap.put(order.getId(), order);
        return order;
    }

    @Override
    public Order pay(int id) {
        Order order = orderMap.get(id);
        System.out.println("线程名称：" + Thread.currentThread().getName() + " 尝试支付，订单号：" + id);
        Message message = MessageBuilder.withPayload(OrderStatusChangeEvent.PAYED).setHeader("order", order).build();
        if (!sendEvent(message, order)) {
            System.out.println("线程名称：" + Thread.currentThread().getName() + " 支付失败, 状态异常，订单号：" + id);
        }
        return orderMap.get(id);
    }

    @Override
    public Order deliver(int id) {
        Order order = orderMap.get(id);
        System.out.println("线程名称：" + Thread.currentThread().getName() + " 尝试发货，订单号：" + id);
        if (!sendEvent(MessageBuilder.withPayload(OrderStatusChangeEvent.DELIVERY).setHeader("order", order).build(), orderMap.get(id))) {
            System.out.println("线程名称：" + Thread.currentThread().getName() + " 发货失败，状态异常，订单号：" + id);
        }
        return orderMap.get(id);
    }

    @Override
    public Order receive(int id) {
        Order order = orderMap.get(id);
        System.out.println("线程名称：" + Thread.currentThread().getName() + " 尝试收货，订单号：" + id);
        if (!sendEvent(MessageBuilder.withPayload(OrderStatusChangeEvent.RECEIVED).setHeader("order", order).build(), orderMap.get(id))) {
            System.out.println("线程名称：" + Thread.currentThread().getName() + " 收货失败，状态异常，订单号：" + id);
        }
        return orderMap.get(id);
    }

    @Override
    public Map<Integer, Order> getOrders() {
        return orderMap;
    }

    private synchronized boolean sendEvent(Message<OrderStatusChangeEvent> message, Order order) {
        boolean result = false;
        try {
            stateMachine.start();
            //尝试恢复状态机状态
            persister.restore(stateMachine, order);
            Thread.sleep(1000);
            result = stateMachine.sendEvent(message);
            // 持久化状态机状态
            persister.persist(stateMachine, order);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            stateMachine.stop();
        }
        return result;
    }
}
