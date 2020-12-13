package com.designpattern.decoratorpattern.pancake.v2;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        BasePancake basePancake;
        basePancake = new BasePancake();
        basePancake = new EggDecorator(basePancake);
        basePancake = new EggDecorator(basePancake);
        basePancake = new SausageDecorator(basePancake);

        System.out.println(basePancake.getMsg() + ",总价" + basePancake.getPrice());
    }
}
