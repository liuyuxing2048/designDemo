package com.example.designdemo.test_design_factory;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description TODO
 * @createTime 2021年08月09日 10:15:00
 */
public class Mail implements SimpleSend {

    @Override
    public void sendMessage() {
        System.out.println("main send msg!");
    }
}
