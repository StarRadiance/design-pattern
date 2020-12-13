package com.designpattern.visitorpattern.kpi;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class CEOVisitor implements IVisitor {

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师" +  engineer.name + "，KIP：" + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" +  manager.name + ",KPI:" + manager.kpi + "，产品数量：" + manager.getProducts());
    }
}
