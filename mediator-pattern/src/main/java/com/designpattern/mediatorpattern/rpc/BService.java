package com.designpattern.mediatorpattern.rpc;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class BService implements IService {
    Registry registry = new Registry();
    BService() {
        registry.register("bService", this);
    }

    public void b() {

    }
}
