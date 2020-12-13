package com.designpattern.birdgepattern.message;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class NormalMessage extends AbstractMessage{
    public NormalMessage(IMessage iMessage) {
        super(iMessage);
    }

    @Override
    void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }
}
