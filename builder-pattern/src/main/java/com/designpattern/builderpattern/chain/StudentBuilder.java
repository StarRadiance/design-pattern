package com.designpattern.builderpattern.chain;

import java.math.BigDecimal;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class StudentBuilder {

    private Student student = new Student();

    public StudentBuilder addName(String name) {
        student.setName(name);
        return this;
    }

    public StudentBuilder addAge(Integer age) {
        student.setAge(age);
        return this;
    }

    public StudentBuilder addSex(Character sex) {
        student.setSex(sex);
        return this;
    }

    public StudentBuilder addHeight(BigDecimal height) {
        student.setHeight(height);
        return this;
    }

    public StudentBuilder addWeight(BigDecimal weight) {
        student.setWeight(weight);
        return this;
    }

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
}
