package com.designpattern.abstractfactorypattern;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class CatAge implements IAge {

    @Override
    public void age() {
        System.out.println("猫已经3个月大了");
    }
}
