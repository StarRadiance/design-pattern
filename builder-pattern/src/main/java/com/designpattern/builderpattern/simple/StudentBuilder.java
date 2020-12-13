package com.designpattern.builderpattern.simple;

import java.math.BigDecimal;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class StudentBuilder {

    private Student student = new Student();

    public void addName(String name) {
        student.setName(name);
    }

    public void addAge(Integer age) {
        student.setAge(age);
    }

    public void addSex(Character sex) {
        student.setSex(sex);
    }

    public void addHeight(BigDecimal height) {
        student.setHeight(height);
    }

    public void addWeight(BigDecimal weight) {
        student.setWeight(weight);
    }
}
