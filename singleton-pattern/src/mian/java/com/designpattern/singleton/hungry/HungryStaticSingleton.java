package com.designpattern.singleton.hungry;

import com.designpattern.singleton.ReflectTest;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description: 饿汉式静态单例  会被反射破坏单例
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton INSTANCE;

    static {
        INSTANCE = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        ReflectTest.reflectDestroySingletonTest(HungryStaticSingleton.class);
    }
}
