package com.designpattern.mediatorpattern.rpc;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Registry {

    private Map map = new HashMap<>();

    public void register(String serviceName, IService iService) {
        map.put(serviceName, iService);
    }

    public Object get(String serviceName) {
        return map.get(serviceName);
    }
}
