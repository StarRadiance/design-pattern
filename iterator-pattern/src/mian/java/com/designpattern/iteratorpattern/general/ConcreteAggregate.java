package com.designpattern.iteratorpattern.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class ConcreteAggregate<E> implements IAggregate<E> {

    private List<E> list = new ArrayList<>();

    @Override
    public boolean add(E element) {
        return list.add(element);
    }

    @Override
    public boolean remove(E element) {
        return list.remove(element);
    }

    @Override
    public Iterator<E> iterator() {
        return new ConcreteIterator<E>(list);
    }
}
