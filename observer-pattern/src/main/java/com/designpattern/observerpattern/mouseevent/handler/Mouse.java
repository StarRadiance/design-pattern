package com.designpattern.observerpattern.mouseevent.handler;


import com.designpattern.observerpattern.mouseevent.core.EventContext;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Mouse extends EventContext {

    public void click() {
        System.out.println("调用点击方法");
        this.trigger(MouseEventType.ON_CLICK);
    }

    public void move() {
        System.out.println("调用移动方法");
        this.trigger(MouseEventType.ON_MOVE);
    }
}
