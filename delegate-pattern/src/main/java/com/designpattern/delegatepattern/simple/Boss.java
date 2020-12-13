package com.designpattern.delegatepattern.simple;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class Boss {

    public void command(String task, Leader leader) {
        leader.doing(task);
    }
}
