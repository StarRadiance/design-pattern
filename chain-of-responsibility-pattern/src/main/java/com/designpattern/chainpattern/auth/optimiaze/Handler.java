package com.designpattern.chainpattern.auth.optimiaze;

import com.designpattern.chainpattern.auth.Member;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public abstract class Handler {

    protected Handler next;

    public void next(Handler next) {
        this.next = next;
    }

    public abstract void doHandler(Member member);
}
