package com.designpattern.builderpattern.simple;

import java.math.BigDecimal;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description: 学生类
 */
public class Student {

    private String name;

    private Integer age;

    private Character sex;

    private BigDecimal height;

    private BigDecimal weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
}
