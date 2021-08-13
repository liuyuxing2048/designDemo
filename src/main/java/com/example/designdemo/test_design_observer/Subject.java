package com.example.designdemo.test_design_observer;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description TODO
 * @createTime 2021年08月11日 17:35:00
 */
public interface Subject {
    // 增加观察者
    public void add(ObServer obServer);

    // 删除观察者
    void remove(ObServer obServer);

    // 通知所有的观察者
    void notifyObservers();

    // 自身的操作
    void operation();
}
