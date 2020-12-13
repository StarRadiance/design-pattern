package com.designpattern.decoratorpattern.pancake.v2;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class BasePancake extends Pancake {

    protected String getMsg() {
        return "煎饼";
    }

    protected Double getPrice() {
        return 5.0;
    }
}
