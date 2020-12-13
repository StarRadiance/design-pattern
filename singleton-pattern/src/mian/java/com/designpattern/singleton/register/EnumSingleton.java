package com.designpattern.singleton.register;

import com.designpattern.singleton.ReflectTest;
import com.designpattern.singleton.lazy.LazyStaticInnerClassSingleton;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description: 注册式枚举单例
 * 优点：不会被反射破坏（枚举没有无参构造方法）
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){return INSTANCE;}

    public static void main(String[] args) {
        ReflectTest.reflectDestroySingletonTest(EnumSingleton.class);
    }
}
