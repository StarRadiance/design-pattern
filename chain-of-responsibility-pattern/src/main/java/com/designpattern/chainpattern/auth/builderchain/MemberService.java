package com.designpattern.chainpattern.auth.builderchain;

import com.designpattern.chainpattern.auth.Member;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class MemberService {

    public void login(String loginName,String loginPass){
        Handler.Builder builder = new Handler.Builder();
        builder.addBuilder(new ValidateHandler())
                .addBuilder(new LoginHandler())
                .addBuilder(new AuthHandler());

        builder.build().doHandler(new Member(loginName,loginPass));
    }
}
