package com.designpattern.observerpattern.mouseevent.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class EventContext {

    protected Map<String, Event> eventMap = new HashMap<String, Event>();

    public void addListener(String eventType, EventListener target, Method callback) {
        eventMap.put(eventType, new Event(target, callback));
    }

    public void addListener(String eventType, EventListener target) {
        try {
            this.addListener(eventType, target, target.getClass().getMethod("on" + toUpperFirstCase(eventType), Event.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String toUpperFirstCase(String eventType) {
        char[] chars = eventType.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }

    private void trigger(Event event) {
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        try {
            if (event.getCallback() != null) {
                // 反射调用回调函数
                event.getCallback().invoke(event.getTarget(), event);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void trigger(String trigger) {
        if (!this.eventMap.containsKey(trigger)) {
            return;
        }
        trigger(this.eventMap.get(trigger).setTrigger(trigger));
    }
}
