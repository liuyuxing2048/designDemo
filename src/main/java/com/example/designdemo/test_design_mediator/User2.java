package com.example.designdemo.test_design_mediator;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description TODO
 * @createTime 2021年08月12日 13:27:00
 */
public class User2 extends User{

    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
