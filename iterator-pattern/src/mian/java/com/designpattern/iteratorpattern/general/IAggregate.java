package com.designpattern.iteratorpattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public interface IAggregate<E> {

    boolean add(E element);

    boolean remove(E element);

    Iterator<E> iterator();
}
