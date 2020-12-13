package com.designpattern.singleton.register;

import com.designpattern.singleton.ReflectTest;
import com.designpattern.singleton.hungry.HungrySingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description: 注册式单例模式 使用的map的Key特性
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className){
        Object instance = null;
        if(!ioc.containsKey(className)){
            try {
                instance = Class.forName(className).newInstance();
                ioc.put(className, instance);
            }catch (Exception e){
                e.printStackTrace();
            }
            return instance;
        }else{
            return ioc.get(className);
        }
    }

    public static void main(String[] args) {
        ReflectTest.reflectDestroySingletonTest(ContainerSingleton.class);
    }

}
