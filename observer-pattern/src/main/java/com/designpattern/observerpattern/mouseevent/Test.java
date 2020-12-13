package com.designpattern.observerpattern.mouseevent;

import com.designpattern.observerpattern.mouseevent.handler.Mouse;
import com.designpattern.observerpattern.mouseevent.handler.MouseEventListener;
import com.designpattern.observerpattern.mouseevent.handler.MouseEventType;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        MouseEventListener listener = new MouseEventListener();

        Mouse mouse = new Mouse();
        mouse.addListener(MouseEventType.ON_CLICK, listener);
        mouse.addListener(MouseEventType.ON_MOVE, listener);

        mouse.click();
        mouse.move();
    }
}
