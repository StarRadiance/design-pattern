package com.designpattern.delegatepattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class ConcreteA implements Task {

    @Override
    public void doTask() {
        System.out.println("执行由A实现");
    }
}
