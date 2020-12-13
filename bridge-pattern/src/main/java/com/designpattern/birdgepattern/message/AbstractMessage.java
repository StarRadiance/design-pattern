package com.designpattern.birdgepattern.message;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class AbstractMessage {

    private IMessage iMessage;

    public AbstractMessage(IMessage iMessage) {
        this.iMessage = iMessage;
    }

    void sendMessage(String message,String toUser){
        this.iMessage.send(message,toUser);
    }
}
