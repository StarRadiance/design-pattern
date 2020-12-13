package com.designpattern.mediatorpattern.rpc;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class AService implements IService {
    Registry registry = new Registry();
    AService() {
        registry.register("aService", this);
    }

    public void a() {
        ((BService) registry.get("bService")).b();
    }
}
