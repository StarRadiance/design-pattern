package com.designpattern.adapterpattern.demo.passport;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class PassportService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg register(String username, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }

    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username, String password) {
        return null;
    }
}
