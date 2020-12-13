package com.designpattern.flyweightpattern.ticket;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("北京西", "上海");
        ticket.showInfo("硬座");
        ticket = TicketFactory.queryTicket("北京西", "上海");
        ticket.showInfo("软座");
        ticket = TicketFactory.queryTicket("北京西", "上海");
        ticket.showInfo("硬卧");
    }
}
