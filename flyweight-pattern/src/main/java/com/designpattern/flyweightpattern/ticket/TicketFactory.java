package com.designpattern.flyweightpattern.ticket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class TicketFactory {

    private static Map<String, ITicket> sTicketPool = new ConcurrentHashMap();

    public static ITicket queryTicket(String from, String to) {
        String key = from + "->" + to;
        if (sTicketPool.containsKey(key)) {
            System.out.println("使用缓存：" + key);
            return sTicketPool.get(key);
        }
        System.out.println("首次查询，创建对象: " + key);
        ITicket ticket = new TrainTicket(from, to);
        sTicketPool.put(key, ticket);
        return ticket;
    }
}
