package com.designpattern.observerpattern.mouseevent.handler;

import com.designpattern.observerpattern.mouseevent.core.Event;
import com.designpattern.observerpattern.mouseevent.core.EventListener;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class MouseEventListener implements EventListener {

    public void onClick(Event event) {
        System.out.println("==========触发鼠标单击事件========\n" + event);
    }

    public void onMove(Event event){
        System.out.println("==========触发鼠标移动事件========\n" + event);
    }
}
