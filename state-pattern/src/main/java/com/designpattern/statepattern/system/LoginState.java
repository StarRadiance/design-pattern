package com.designpattern.statepattern.system;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class LoginState extends UserState {
    @Override
    public void favorite() {
        System.out.println("收藏成功！");
    }

    @Override
    public void comment(String comment) {
        System.out.println(comment);
    }
}
