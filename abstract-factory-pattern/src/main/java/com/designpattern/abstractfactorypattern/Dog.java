package com.designpattern.abstractfactorypattern;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description: 狗
 */
public class Dog implements IAnimal {

    @Override
    public void description() {
        System.out.println("我是一只狗");
    }
}
