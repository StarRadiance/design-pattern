package com.designpattern.observerpattern.guava;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Pojo {

    private String name;

    public Pojo(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "name='" + name + '\'' +
                '}';
    }
}
