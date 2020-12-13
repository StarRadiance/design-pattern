package com.designpattern.mediatorpattern.rpc;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class CService implements IService {
    Registry registry = new Registry();
    CService() {
        registry.register("cService", this);
    }

    public void c() {

    }
}
