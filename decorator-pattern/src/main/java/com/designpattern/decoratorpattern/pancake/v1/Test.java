package com.designpattern.decoratorpattern.pancake.v1;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Pancake pancake = new Pancake();
        System.out.println(pancake.getMsg() + ",总价：" + pancake.getPrice());

        PancakeWithEgg PancakeWithEgg = new PancakeWithEgg();
        System.out.println(PancakeWithEgg.getMsg() + ",总价：" + PancakeWithEgg.getPrice());

        PancakeWithEggAndSausage pancakeWithEggAndSausage = new PancakeWithEggAndSausage();
        System.out.println(pancakeWithEggAndSausage.getMsg() + ",总价：" + pancakeWithEggAndSausage.getPrice());
    }

}
