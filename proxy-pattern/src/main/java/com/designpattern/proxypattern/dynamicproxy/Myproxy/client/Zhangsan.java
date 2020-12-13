package com.designpattern.proxypattern.dynamicproxy.Myproxy.client;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class Zhangsan implements IPerson {

    public void findLove() {
        System.out.println("张三要求：肤白貌美大长腿");
    }

    public void buyInsure() {
        System.out.println("30万");
    }

}
