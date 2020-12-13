package com.designpattern.observerpattern.studysystem;

import java.util.Observable;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Student extends Observable {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question) {
        System.out.println(name + "提交了一个问题——" + question.getContent());
        setChanged();
        notifyObservers(question);
    }
}
