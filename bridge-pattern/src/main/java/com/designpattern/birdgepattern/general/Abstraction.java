package com.designpattern.birdgepattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public abstract class Abstraction {

    protected IImplementor iImplementor;
    
    public Abstraction(IImplementor iImplementor) {
        this.iImplementor = iImplementor;
    }

    public void operation() {
        this.iImplementor.operationImpl();
    }
}
