package com.designpattern.chainpattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Handler handleA = new ConcreteHandlerA();
        Handler handleB = new ConcreteHandlerB();
        handleA.setNextHandler(handleB);
        handleA.handleRequest("requestB");
    }
}
