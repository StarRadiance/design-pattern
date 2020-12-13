package com.designpattern.birdgepattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class ConcreteImplementorA implements IImplementor {

    @Override
    public void operationImpl() {
        System.out.println("I'm ConcreteImplementor A");
    }
}
