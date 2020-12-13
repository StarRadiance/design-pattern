package com.designpattern.visitorpattern.dispatch.dymdispatch;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Person man = new Man();
        Person woman = new WoMan();

        man.test();
        woman.test();
    }
}
