package com.designpattern.flyweightpattern.ticket;

import java.util.Random;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class TrainTicket implements ITicket {

    private String from;
    private String to;
    private int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }


    public void showInfo(String bunk) {
        this.price = new Random().nextInt(500);
        System.out.println(String.format("%s->%s：%s价格：%s 元", this.from, this.to, bunk, this.price));
    }
}
