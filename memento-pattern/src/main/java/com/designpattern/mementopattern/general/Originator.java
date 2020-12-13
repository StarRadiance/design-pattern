package com.designpattern.mementopattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 创建一个备忘录
    public Memento createMemento() {
        return new Memento(this.state);
    }

    // 从备忘录恢复
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
