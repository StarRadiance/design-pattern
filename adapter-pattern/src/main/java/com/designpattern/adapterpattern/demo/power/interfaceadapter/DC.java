package com.designpattern.adapterpattern.demo.power.interfaceadapter;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public interface DC {
    int output5V();
    int output12V();
    int output24V();
    int output36V();
}
