package com.designpattern.adapterpattern.general.objectadapter;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        int result = target.request();
        System.out.println(result);
    }
}
