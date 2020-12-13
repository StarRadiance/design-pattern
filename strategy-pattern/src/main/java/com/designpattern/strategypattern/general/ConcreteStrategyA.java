package com.designpattern.strategypattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class ConcreteStrategyA implements IStrategy {

    @Override
    public void algorithm() {
        System.out.println("Strategy A");
    }
}
