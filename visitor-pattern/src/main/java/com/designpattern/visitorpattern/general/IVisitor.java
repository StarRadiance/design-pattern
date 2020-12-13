package com.designpattern.visitorpattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public interface IVisitor {

    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}
