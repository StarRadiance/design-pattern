package com.designpattern.singleton.lazy;

import com.designpattern.singleton.ReflectTest;
import com.designpattern.singleton.hungry.HungrySingleton;

import java.lang.reflect.Constructor;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description: 静态内部类懒汉式单例
 * 优点：写法优雅，利用了Java本身语法特点，性能高，避免了内存浪费,不能被反射破坏
 * 缺点：不优雅   会被反射破坏单例
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton() {
        // 校验，防止反射破坏单例  下面案例是反射破坏单例的案例
        if(LazyHolder.INSTANCE != null){
            throw new RuntimeException("不允许非法访问");
        }
    }

    public static LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }

    public static void main(String[] args) {
        ReflectTest.reflectDestroySingletonTest(LazyStaticInnerClassSingleton.class);
    }

}
