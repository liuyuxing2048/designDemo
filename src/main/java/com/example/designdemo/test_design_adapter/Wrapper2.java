package com.example.designdemo.test_design_adapter;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 抽象类 继承接口 有选择的重写方法
 * @createTime 2021年08月11日 14:53:00
 */
public abstract class Wrapper2 implements Sourceable {

    @Override
    public void method1() {
        System.out.println("this is Top method1");
    }

    @Override
    public void method2() {
        System.out.println("this is Top method2");
    }
}
