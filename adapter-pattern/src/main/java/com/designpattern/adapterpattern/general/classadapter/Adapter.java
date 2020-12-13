package com.designpattern.adapterpattern.general.classadapter;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public int request() {
        return super.specificRequest() / 10;
    }
}
