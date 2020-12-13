package com.desginpattern.templatepattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        AbstractClass abc = new ConcreteClassA();
        abc.templateMethod();
        abc = new ConcreteClassB();
        abc.templateMethod();
    }
}
