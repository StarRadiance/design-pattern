package com.designpattern.statepattern.general.simple;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class ConcreteStateB implements IState {

    @Override
    public void handle() {
        System.out.println("StateB do action");
    }
}
