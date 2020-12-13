package com.designpattern.observerpattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description: 抽象观察者
 */
public interface IObserver<E> {

    void update(E event);
}
