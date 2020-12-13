package com.designpattern.adapterpattern.demo.passport.adapterv2.adapters;

import com.designpattern.adapterpattern.demo.passport.PassportService;
import com.designpattern.adapterpattern.demo.passport.ResultMsg;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public abstract class AbstractAdapter extends PassportService implements ILoginAdapter {

    protected ResultMsg loginForRegister(String username, String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.register(username,password);
        return super.login(username,password);
    }
}
