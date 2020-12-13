package com.designpattern.visitorpattern.kpi;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public interface IVisitor {

    void visit(Engineer engineer);

    void visit(Manager manager);

}
