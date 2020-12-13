package com.designpattern.visitorpattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class ConcreteElementB implements IElement {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return this.getClass().getSimpleName();
    }
}
