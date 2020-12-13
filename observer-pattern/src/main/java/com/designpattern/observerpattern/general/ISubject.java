package com.designpattern.observerpattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description: 抽象主题者
 */
public interface ISubject<E> {

    boolean attach(IObserver<E> observer);

    boolean detach(IObserver<E> observer);

    void notify(E event);
}
