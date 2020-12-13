package com.designpattern.proxypattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
