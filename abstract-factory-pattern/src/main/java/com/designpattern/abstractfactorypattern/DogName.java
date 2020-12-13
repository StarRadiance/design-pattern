package com.designpattern.abstractfactorypattern;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class DogName implements IName {

    @Override
    public void name() {
        System.out.println("狗的名字叫：旺财");
    }
}
