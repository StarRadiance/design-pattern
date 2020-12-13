package com.designpattern.observerpattern.guava;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Vo {

    private String name;

    public Vo(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vo{" +
                "name='" + name + '\'' +
                '}';
    }
}
