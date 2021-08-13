package com.example.designdemo.test_design_adapter;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 接口的适配器模式 - 中间通过抽象类 不与原接口接触
 * @createTime 2021年08月11日 14:54:00
 */
public class SourceSub1 extends Wrapper2{
    @Override
    public void method1(){
        System.out.println("the sourceable interface's first Sub1!");
    }


}
