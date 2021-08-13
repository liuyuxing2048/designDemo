package com.example.designdemo.test_design_visitor;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description TODO
 * @createTime 2021年08月12日 11:35:00
 */
public class MySubject implements Subject {

    private String[] elements = {"a","b","c"};

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return elements.toString();
    }
}
