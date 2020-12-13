package com.designpattern.adapterpattern.demo.passport.adapterv2.adapters;

import com.designpattern.adapterpattern.demo.passport.ResultMsg;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public interface ILoginAdapter {
    boolean support(Object object);

    ResultMsg login(String id, Object adapter);
}
