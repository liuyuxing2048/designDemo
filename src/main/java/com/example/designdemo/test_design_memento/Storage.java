package com.example.designdemo.test_design_memento;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 存储备忘录的类，持有Memento类的实例
 * @createTime 2021年08月12日 11:00:00
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
