package com.designpattern.adapterpattern.demo.power.interfaceadapter;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter(new AC220());
        powerAdapter.output5V();
    }
}
