package com.designpattern.proxypattern.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class JdkMeiPo implements InvocationHandler {

    private IPerson iPerson;

    public IPerson getInstance(IPerson iPerson) {
        this.iPerson = iPerson;
        Class<?> clazz = iPerson.getClass();
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.iPerson, args);
        after();
        return obj;
    }

    private void before() {
        System.out.println("我是媒婆，已经收集到你的需求，开始物色");
    }

    private void after() {
        System.out.println("双方同意，开始交往");
    }
}
