package com.designpattern.observerpattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description: 具体观察者
 */
public class ConcreteObserver<E> implements IObserver<E> {

    public void update(E event) {
        System.out.println("receive event: " + event);
    }
}
