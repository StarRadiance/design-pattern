package com.designpattern.birdgepattern.message;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public interface IMessage {
    //发送消息的内容和接收人
    void send(String message,String toUser);
}
