package com.designpattern.delegatepattern.general;

import java.util.Random;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description: 代理角色
 */
public class Delegate implements Task {

    @Override
    public void doTask() {
        System.out.println("代理执行开始....");
        Task task = null;
        if (new Random().nextBoolean()){
            task = new ConcreteA();
            task.doTask();
        }else{
            task = new ConcreteB();
            task.doTask();
        }

        System.out.println("代理执行完毕....");
    }
}
