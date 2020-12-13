package com.designpattern.observerpattern.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class PojoEven {

    @Subscribe
    public void observer(Pojo pojo) {
        System.out.println("执行PojoEvent方法，传参为：" + pojo);
    }
}
