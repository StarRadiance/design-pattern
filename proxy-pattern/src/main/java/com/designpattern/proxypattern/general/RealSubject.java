package com.designpattern.proxypattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class RealSubject implements ISubject {

    @Override
    public void request() {
        System.out.println("real service is called.");
    }
}
