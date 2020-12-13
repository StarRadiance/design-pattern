package com.designpattern.decoratorpattern.pancake.v1;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class PancakeWithEggAndSausage extends PancakeWithEgg {

    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    public Double getPrice() {
        return super.getPrice() + 1;
    }
}
