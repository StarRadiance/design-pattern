package com.designpattern.mediatorpattern.chatroom;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User top = new User("Tom", chatRoom);
        User jerry = new User("Jerry", chatRoom);

        top.sendMessage("Hi！I am Tom.");
        jerry.sendMessage("Hello, My name is Jerry.");
    }
}
