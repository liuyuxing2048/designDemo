package com.example.designdemo.test_design_observer;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description TODO
 * @createTime 2021年08月11日 17:34:00
 */
public class Observer2 implements ObServer{

    @Override
    public void update() {
        System.out.println("observer2 has received");
    }
}
