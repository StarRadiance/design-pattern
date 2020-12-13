package com.designpattern.observerpattern.guava;

import com.google.common.eventbus.EventBus;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        PojoEven pojoEven = new PojoEven();
        VoEven voEven = new VoEven();
        eventBus.register(pojoEven);
        eventBus.register(voEven);

        eventBus.post("test");
    }
}
