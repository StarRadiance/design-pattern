package com.designpattern.statepattern.general.apply;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class ConcreteStateA extends State {

    @Override
    public void handle() {
        System.out.println("StateA do action");
        this.context.setState(Context.STATE_B);
        this.context.getState().handle();
    }
}
