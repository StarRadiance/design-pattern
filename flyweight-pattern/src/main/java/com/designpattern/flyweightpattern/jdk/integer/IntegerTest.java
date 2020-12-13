package com.designpattern.flyweightpattern.jdk.integer;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class IntegerTest {

    public static void main(String[] args) {
        // Integer  -128————> 127之间是享元(Integer初始化创建cache)
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b:" + (a==b));
        System.out.println("c==d:" + (c==d));
    }
}
