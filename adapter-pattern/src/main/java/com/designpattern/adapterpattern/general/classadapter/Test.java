package com.designpattern.adapterpattern.general.classadapter;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Target adapter = new Adapter();
        int result = adapter.request();
        System.out.println(result);
    }
}
