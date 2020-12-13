package com.designpattern.observerpattern.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class VoEven {

    @Subscribe
    public void observer(Vo vo) {
        System.out.println("执行VoEvent方法，传参为：" + vo);
    }
}
