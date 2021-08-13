package com.example.designdemo.test_design_memento;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 备忘录类
 * @createTime 2021年08月12日 10:57:00
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
