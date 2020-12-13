package com.designpattern.visitorpattern.kpi;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class CTOVisitor implements IVisitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师" +  engineer.name + "，代码行数：" + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" +  manager.name + "，产品数量：" + manager.getProducts());
    }
}
