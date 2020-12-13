package com.designpattern.adapterpattern.demo.passport.adapterv1;

import com.designpattern.adapterpattern.demo.passport.ResultMsg;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String openid);

    ResultMsg loginForWechat(String openid);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelPhone(String phone, String code);
}
