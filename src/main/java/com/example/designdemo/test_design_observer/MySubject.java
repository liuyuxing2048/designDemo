package com.example.designdemo.test_design_observer;


/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description TODO
 * @createTime 2021年08月11日 17:39:00
 */
public class MySubject extends AbstractSubject{

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());
        sub.operation();
    }
}
