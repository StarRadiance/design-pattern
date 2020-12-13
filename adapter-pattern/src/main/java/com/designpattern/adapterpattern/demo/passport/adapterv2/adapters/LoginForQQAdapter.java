package com.designpattern.adapterpattern.demo.passport.adapterv2.adapters;

import com.designpattern.adapterpattern.demo.passport.ResultMsg;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class LoginForQQAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if(!support(adapter)){return null;}
        return super.loginForRegister(id,null);
    }
}
