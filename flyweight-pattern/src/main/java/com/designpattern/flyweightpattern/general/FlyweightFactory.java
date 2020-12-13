package com.designpattern.flyweightpattern.general;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description: 享元工厂
 */
public class FlyweightFactory {

    private static Map<String, IFlyweight> pool = new HashMap<>();

    public static IFlyweight getFlyweight(String intrinsicState) {
        if (!pool.containsKey(intrinsicState)) {
            IFlyweight flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return pool.get(intrinsicState);
    }
}
