package com.designpattern.adapterpattern.general.interfaceadapter;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee()) {
            @Override
            public int request1() {
                return adaptee.specificRequest() / 10;
            }
        };
        int result = target.request1();
        System.out.println(result);
    }
}
