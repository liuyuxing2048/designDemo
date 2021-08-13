package com.example.designdemo.test_design_memento;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 原始类 里面有需要保存的属性value及创建一个备忘录类，用来保存value值。
 * 主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象，个人觉得叫备份模式更形象些
 * @createTime 2021年08月12日 10:56:00
 */
public class Original {

    private String value;

    public Original(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento createMemento(){
        return new Memento(value);
    }

    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }
}
