package com.designpattern.interpreter.calculate;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("result: " + new MyCalculator("10 + 30").calculate());
        System.out.println("result: " + new MyCalculator("10 + 30 - 20").calculate());
        System.out.println("result: " + new MyCalculator("100 * 2 + 400 * 1 + 66").calculate());
    }
}
