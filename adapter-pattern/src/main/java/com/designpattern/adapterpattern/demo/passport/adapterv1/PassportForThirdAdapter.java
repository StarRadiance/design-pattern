package com.designpattern.adapterpattern.demo.passport.adapterv1;

import com.designpattern.adapterpattern.demo.passport.PassportService;
import com.designpattern.adapterpattern.demo.passport.ResultMsg;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class PassportForThirdAdapter extends PassportService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String openid) {
        return loginForRegister(openid,null);
    }

    @Override
    public ResultMsg loginForWechat(String openid) {
        return loginForRegister(openid,null);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return loginForRegister(token,null);
    }

    @Override
    public ResultMsg loginForTelPhone(String phone, String code) {
        return loginForRegister(phone,null);
    }

    private ResultMsg loginForRegister(String username,String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.register(username,password);
        return super.login(username,password);
    }
}
