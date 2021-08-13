package com.example.designdemo.test_design_proxy;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 原类
 * @createTime 2021年08月11日 15:14:00
 */
public class Source implements Sourceable{

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
