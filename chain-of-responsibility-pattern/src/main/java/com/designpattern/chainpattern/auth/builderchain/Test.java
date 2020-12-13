package com.designpattern.chainpattern.auth.builderchain;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        new MemberService().login("admin", "123456");
    }
}
