package com.example.designdemo.test_design_visitor;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description Subject类，accept方法，接受将要访问它的对象
 * ，getSubject()获取将要被访问的属性，
 * @createTime 2021年08月12日 11:33:00
 */
public interface Subject {
    void accept(Visitor visitor);
    String getSubject();
}
