package com.designpattern.iteratorpattern.course;

import java.util.List;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class IteratorImpl<E> implements Iterator<E> {

    private List<E> list;
    private int cursor;
    private E element;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        System.out.println("当前位置:" + cursor);
        element = list.get(cursor);
        cursor++;
        return element;
    }

    @Override
    public boolean haseNext() {
        return cursor < list.size();
    }
}
