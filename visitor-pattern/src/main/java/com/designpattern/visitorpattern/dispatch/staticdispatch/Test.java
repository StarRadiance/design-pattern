package com.designpattern.visitorpattern.dispatch.staticdispatch;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Test {
    public void test(String string){
        System.out.println("string" + string);
    }
    public void test(Integer integer){
        System.out.println("integer" + integer);
    }

    public static void main(String[] args) {
        String string = "1";
        Integer integer = 1;
        Test main = new Test();
        main.test(integer);
        main.test(string);
    }

}
