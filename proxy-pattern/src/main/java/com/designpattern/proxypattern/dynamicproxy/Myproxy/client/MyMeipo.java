package com.designpattern.proxypattern.dynamicproxy.Myproxy.client;

import com.designpattern.proxypattern.dynamicproxy.Myproxy.proxy.MyClassLoader;
import com.designpattern.proxypattern.dynamicproxy.Myproxy.proxy.MyInvocationHandler;
import com.designpattern.proxypattern.dynamicproxy.Myproxy.proxy.MyProxy;

import java.lang.reflect.Method;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class MyMeipo implements MyInvocationHandler {
    private IPerson target;
    public IPerson getInstance(IPerson target){
        this.target = target;
        Class<?> clazz =  target.getClass();
        return (IPerson) MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target,args);
        after();
        return result;
    }

    private void after() {
        System.out.println("双方同意，开始交往");
    }

    private void before() {
        System.out.println("我是媒婆，已经收集到你的需求，开始物色");
    }
}
