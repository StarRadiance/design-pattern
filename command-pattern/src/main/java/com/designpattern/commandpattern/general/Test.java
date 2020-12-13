package com.designpattern.commandpattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        ICommand command = new ConcreteCommand();
        new Invoker(command).action();
    }
}
