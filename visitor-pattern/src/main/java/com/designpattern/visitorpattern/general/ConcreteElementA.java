package com.designpattern.visitorpattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class ConcreteElementA implements IElement {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return this.getClass().getSimpleName();
    }
}
