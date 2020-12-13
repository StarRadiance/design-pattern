package com.designpattern.proxypattern.dynamicproxy.Myproxy.proxy;

import java.lang.reflect.Method;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public interface MyInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
