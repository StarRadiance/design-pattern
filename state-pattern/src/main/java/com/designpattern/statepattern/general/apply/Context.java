package com.designpattern.statepattern.general.apply;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class Context {

    public static final State STATE_A = new ConcreteStateA();
    public static final State STATE_B = new ConcreteStateB();

    private State currState = STATE_A;

    {
        STATE_A.setContext(this);
        STATE_B.setContext(this);
    }

    public void setState(State state){
        this.currState = state;
        this.currState.setContext(this);
    }

    public State getState() {
        return this.currState;
    }

    public void handle() {
        this.currState.handle();
    }
}
