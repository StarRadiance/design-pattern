package com.designpattern.abstractfactorypattern;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class DogAge implements IAge {

    @Override
    public void age() {
        System.out.println("狗已经5个月大了");
    }
}
