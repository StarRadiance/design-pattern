package com.designpattern.proxypattern.staticproxy;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class ZhangLaoSan implements IPerson {

    private ZhangSan zhangsan;

    public ZhangLaoSan(ZhangSan zhangsan) {
        this.zhangsan = zhangsan;
    }

    public void findLove() {
        System.out.println("张老三开始物色");
        zhangsan.findLove();
        System.out.println("开始交往");
    }

}
