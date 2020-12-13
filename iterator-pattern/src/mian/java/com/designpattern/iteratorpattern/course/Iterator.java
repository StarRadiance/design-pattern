package com.designpattern.iteratorpattern.course;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public interface Iterator<E> {

    E next();

    boolean haseNext();
}
