package com.designpattern.proxypattern.staticproxy;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ZhangLaoSan zhangLaosan = new ZhangLaoSan(new ZhangSan());
        zhangLaosan.findLove();
    }
}
