package com.designpattern.delegatepattern.simple;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        new Boss().command("海报图",new Leader());
        new Boss().command("爬虫",new Leader());
        new Boss().command("卖手机",new Leader());
    }
}
