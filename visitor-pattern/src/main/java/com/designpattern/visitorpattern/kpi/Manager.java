package com.designpattern.visitorpattern.kpi;

import java.util.Random;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * 考核的是每年新产品研发数量
     * @return
     */
    public int getProducts(){
        return new Random().nextInt(10);
    }
}
