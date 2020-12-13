package com.designpattern.abstractfactorypattern;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class CatName implements IName {

    @Override
    public void name() {
        System.out.println("猫的名字叫：小花");
    }
}
