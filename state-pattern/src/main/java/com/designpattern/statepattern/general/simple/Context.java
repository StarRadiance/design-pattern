package com.designpattern.statepattern.general.simple;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class Context {

    public static final IState STATE_A = new ConcreteStateA();
    public static final IState STATE_B = new ConcreteStateB();
    // 默认状态A
    private IState currState = STATE_A;

    public void setState(IState iState) {
        currState = iState;
    }

    public void handle() {
        currState.handle();
    }

}
