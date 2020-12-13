package com.desginpattern.templatepattern.jdbc;

import com.desginpattern.templatepattern.jdbc.dao.MemberDao;

import java.util.List;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
    }
}
