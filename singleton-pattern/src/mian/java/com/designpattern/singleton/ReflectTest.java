package com.designpattern.singleton;

import com.designpattern.singleton.hungry.HungrySingleton;

import java.lang.reflect.Constructor;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class ReflectTest {

    /**
     * 反射破坏单例测试
     * @param clazz
     */
    public static void reflectDestroySingletonTest(Class<?> clazz){
        try{
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Object instance1 = constructor.newInstance();
            Object instance2 = constructor.newInstance();
            System.out.println(instance1);
            System.out.println(instance2);
            System.out.println("实例是否相等" + instance1 == instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
