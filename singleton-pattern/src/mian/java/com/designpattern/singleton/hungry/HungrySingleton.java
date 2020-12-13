package com.designpattern.singleton.hungry;

import com.designpattern.singleton.ReflectTest;
import com.designpattern.singleton.lazy.LazyStaticInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description: 饿汉式单例
 * 优点：执行效率高，性能高，没有任何的锁
 * 缺点：某些情况下，可能会造成内存浪费  且会被反射破坏单例
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {};

    public static HungrySingleton getInstance() {
        return INSTANCE;
    };

    public static void main(String[] args) {
        ReflectTest.reflectDestroySingletonTest(HungrySingleton.class);
    }
}
