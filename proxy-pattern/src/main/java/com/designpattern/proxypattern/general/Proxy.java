package com.designpattern.proxypattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class Proxy implements ISubject {

    private ISubject iSubject;

    public Proxy(ISubject iSubject) {
        this.iSubject = iSubject;
    }

    @Override
    public void request() {
        before();
        iSubject.request();
        after();
    }

    private void before(){
        System.out.println("called before request().");
    }

    private void after(){
        System.out.println("called after request().");
    }

}
