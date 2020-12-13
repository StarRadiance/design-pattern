package com.designpattern.chainpattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public abstract class Handler {

    protected Handler nextHandler;

    public void setNextHandler(Handler successor) {
        this.nextHandler = successor;
    }

    public abstract void handleRequest(String request);
}
