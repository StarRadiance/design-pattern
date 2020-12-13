package com.designpattern.proxypattern.dynamicproxy.jdkproxy;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class JdkTest {

    public static void main(String[] args) {
        IPerson zhangSan = new JdkMeiPo().getInstance(new ZhangSan());
        zhangSan.findLove();

        System.out.println("------------------------------------");

        IPerson zhaoLiu = new JdkMeiPo().getInstance(new ZhaoLiu());
        zhaoLiu.findLove();
    }
}
