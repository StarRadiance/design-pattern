package com.desginpattern.templatepattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class AbstractClass {

    protected void step1() {
        System.out.println("AbstractClass:step1");
    }

    protected void step2() {
        System.out.println("AbstractClass:step2");
    }

    protected void step3() {
        System.out.println("AbstractClass:step3");
    }

    // 声明为final方法，避免子类覆写
    public final void templateMethod() {
        this.step1();
        this.step2();
        this.step3();
    }
}
