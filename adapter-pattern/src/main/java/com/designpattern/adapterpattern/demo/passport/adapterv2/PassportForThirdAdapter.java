package com.designpattern.adapterpattern.demo.passport.adapterv2;

import com.designpattern.adapterpattern.demo.passport.ResultMsg;
import com.designpattern.adapterpattern.demo.passport.adapterv2.adapters.*;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class PassportForThirdAdapter implements IPassportForThird {

    @Override
    public ResultMsg loginForQQ(String openid) {
        return processLogin(openid, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String openid) {
        return processLogin(openid, LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForTelPhone(String phone, String code) {
        return processLogin(phone, LoginForTelAdapter.class);
    }

    private ResultMsg processLogin(String id, Class<? extends ILoginAdapter> clazz) {
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(id, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
