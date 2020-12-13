package com.designpattern.proxypattern.dynamicproxy.Myproxy.client;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        MyMeipo myMeipo = new MyMeipo();
        IPerson zhangsan = myMeipo.getInstance(new Zhangsan());
        zhangsan.findLove();


//        IPerson zhaoliu = jdkMeipo.getInstance(new ZhaoLiu());
//        zhaoliu.findLove();
//        zhaoliu.buyInsure();


    }
}
