package com.designpattern.statepattern.general.simple;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class ConcreteStateA implements IState {

    @Override
    public void handle() {
        System.out.println("StateA do action");
    }
}
