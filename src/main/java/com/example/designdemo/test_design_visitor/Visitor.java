package com.example.designdemo.test_design_visitor;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 访问者模式就是一种分离对象数据结构与行为的方法，
 * 通过这种分离，可达到为一个被访问者动态添加新的操作而无需做其它的修改的效果
 * @createTime 2021年08月12日 11:26:00
 */
public interface Visitor {
    public void visit(Subject subject);
}
