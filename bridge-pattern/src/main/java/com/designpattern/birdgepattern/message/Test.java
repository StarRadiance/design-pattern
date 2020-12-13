package com.designpattern.birdgepattern.message;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        AbstractMessage message = new NormalMessage(new EmailMessage());
        message.sendMessage("加班申请","王总");

        message = new UrgencyMessage(new SmsMessage());
        message.sendMessage("加班申请","王总");
    }
}
