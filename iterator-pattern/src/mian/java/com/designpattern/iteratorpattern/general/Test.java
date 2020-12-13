package com.designpattern.iteratorpattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        IAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("one");
        aggregate.add("two");
        aggregate.add("three");
        Iterator iterator = aggregate.iterator();
        while (iterator.haseNext()) {
            System.out.println(iterator.next());
        }
    }
}
