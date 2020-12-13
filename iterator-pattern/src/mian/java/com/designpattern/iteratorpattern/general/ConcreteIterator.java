package com.designpattern.iteratorpattern.general;

import java.util.List;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class ConcreteIterator<E> implements Iterator<E> {

    private List<E> list;
    private int cursor = 0;

    public ConcreteIterator(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        return list.get(cursor ++);
    }

    @Override
    public boolean haseNext() {
        return cursor < list.size();
    }
}
