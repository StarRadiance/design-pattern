package com.designpattern.abstractfactorypattern;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description: 猫
 */
public class Cat implements IAnimal {

    @Override
    public void description() {
        System.out.println("我是一只猫");
    }
}
