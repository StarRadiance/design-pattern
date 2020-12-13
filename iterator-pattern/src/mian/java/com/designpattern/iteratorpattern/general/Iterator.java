package com.designpattern.iteratorpattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public interface Iterator<E> {

    E next();

    boolean haseNext();
}
