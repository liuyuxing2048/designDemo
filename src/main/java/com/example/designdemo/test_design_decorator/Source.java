package com.example.designdemo.test_design_decorator;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 被装饰的类
 * @createTime 2021年08月11日 15:01:00
 */
public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("this is original method!");
    }
}
