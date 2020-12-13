package com.designpattern.strategypattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class Context {

    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void algorithm() {
        iStrategy.algorithm();
    }
}
