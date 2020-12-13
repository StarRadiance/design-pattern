package com.designpattern.singleton.lazy;

import com.designpattern.singleton.ReflectTest;
import com.designpattern.singleton.hungry.HungrySingleton;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description: 双从检查懒汉式单例
 * 优点:性能高了，线程安全了
 * 缺点：可读性难度加大，不够优雅 会被反射破坏单例
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        //检查是否要阻塞
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                //检查是否要重新创建实例
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        ReflectTest.reflectDestroySingletonTest(LazyDoubleCheckSingleton.class);
    }

}
