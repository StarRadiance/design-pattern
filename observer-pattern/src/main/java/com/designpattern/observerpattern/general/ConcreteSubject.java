package com.designpattern.observerpattern.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description: 具体主题者
 */
public class ConcreteSubject<E> implements ISubject<E> {
    private List<IObserver<E>> list = new ArrayList<IObserver<E>>();

    public boolean attach(IObserver<E> observer) {
        return !this.list.contains(observer) && this.list.add(observer);
    }

    public boolean detach(IObserver<E> observer) {
        return this.list.remove(observer);
    }

    public void notify(E event) {
        for (IObserver<E> observer : this.list) {
            observer.update(event);
        }
    }
}
