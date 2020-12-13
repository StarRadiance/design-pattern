package com.designpattern.birdgepattern.message;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(IMessage iMessage) {
        super(iMessage);
    }

    @Override
    void sendMessage(String message, String toUser) {
        message = "【加急】" + message;
        super.sendMessage(message, toUser);
    }
}
