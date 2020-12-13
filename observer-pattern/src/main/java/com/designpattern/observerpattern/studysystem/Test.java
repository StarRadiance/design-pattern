package com.designpattern.observerpattern.studysystem;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Student student = new Student("张三");
        Teacher tom = new Teacher("Tom");
        Teacher jerry = new Teacher("Jerry");

        student.addObserver(tom);
        student.addObserver(jerry);

        //用户行为
        Question question = new Question();
        question.setContent("观察者模式适用于哪些场景？");

        student.publishQuestion(question);
    }
}
