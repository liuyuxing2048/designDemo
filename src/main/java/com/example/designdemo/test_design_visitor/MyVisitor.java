package com.example.designdemo.test_design_visitor;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 一个Visitor类，存放要访问的对象
 * @createTime 2021年08月12日 11:33:00
 */
public class MyVisitor implements Visitor{

    @Override
    public void visit(Subject subject) {
        System.out.println("visit the subject: " + subject.getSubject());
    }
}
