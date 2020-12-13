package com.designpattern.visitorpattern.kpi;

import java.util.Random;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public abstract class Employee {
    public String name;
    public int kpi;

    public Employee(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    /**
     * 接收访问者的请求
     * @param visitor
     */
    public abstract void accept(IVisitor visitor);
}
