package com.designpattern.mementopattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Caretaker {
    // 备忘录对象
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void storeMemento(Memento memento) {
        this.memento = memento;
    }
}
