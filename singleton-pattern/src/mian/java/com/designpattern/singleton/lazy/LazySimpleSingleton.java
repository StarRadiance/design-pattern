package com.designpattern.singleton.lazy;

import com.designpattern.singleton.ReflectTest;
import com.designpattern.singleton.hungry.HungrySingleton;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description: 基础懒汉式单例
 * 优点：节省了内存,线程安全
 * 缺点：性能低  会被反射破坏单例
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton instance;

    private LazySimpleSingleton(){}

    public synchronized static LazySimpleSingleton getInstance(){
        if(instance == null){
            instance = new LazySimpleSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        ReflectTest.reflectDestroySingletonTest(LazySimpleSingleton.class);
    }
}
