package com.designpattern.visitorpattern.kpi;

import java.util.Random;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Engineer extends Employee {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * 考核指标是每年的代码量
     * @return
     */
    public int getCodeLines(){
        return new Random().nextInt(10* 10000);
    }
}
