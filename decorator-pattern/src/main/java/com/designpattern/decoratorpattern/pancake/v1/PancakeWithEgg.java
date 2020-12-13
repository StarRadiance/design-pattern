package com.designpattern.decoratorpattern.pancake.v1;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class PancakeWithEgg extends Pancake {

    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    public Double getPrice() {
        return super.getPrice() + 2;
    }
}
