package com.designpattern.chainpattern.auth.builderchain;

import com.designpattern.chainpattern.auth.Member;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class ValidateHandler extends Handler {

    @Override
    public void doHandler(Member member) {
        if(member == null || member.getLoginName() == null || "".equals(member.getLoginName())
                || member.getLoginPass() == null || "".equals(member.getLoginPass())){
            System.out.println("用户名和密码为空");
            return;
        }
        System.out.println("用户名和密码不为空，可以往下执行");
        next.doHandler(member );
    }
}
