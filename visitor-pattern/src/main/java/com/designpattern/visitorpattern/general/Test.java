package com.designpattern.visitorpattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        ObjectStructure collection = new ObjectStructure();
        System.out.println("ConcreteVisitorA handle elements:");
        IVisitor visitorA = new ConcreteVisitorA();
        collection.accept(visitorA);
        System.out.println("------------------------------------");
        System.out.println("ConcreteVisitorB handle elements:");
        IVisitor visitorB = new ConcreteVisitorB();
        collection.accept(visitorB);
    }
}
