package com.designpattern.chainpattern.auth.builderchain;

import com.designpattern.chainpattern.auth.Member;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class LoginHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        Member temp = checkExists(member.getLoginName(),member.getLoginPass());
        if(null == temp ){
            System.out.println("用户不存在");
            return;
        }
        System.out.println("登录成功！");
        next.doHandler(member);
    }

    private Member checkExists(String loginName, String loginPass){
        Member member = new Member(loginName,loginPass);
        member.setRoleName("管理员");
        return member;
    }
}
