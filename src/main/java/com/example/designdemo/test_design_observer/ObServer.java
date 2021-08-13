package com.example.designdemo.test_design_observer;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 观察者接口
 * 观察者模式: 当一个对象变化时，其它依赖该对象的对象都会收到通知，
 *           并且随着变化！对象之间是一种一对多的关系
 * @createTime 2021年08月11日 17:33:00
 */
public interface ObServer {
    void update();
}
