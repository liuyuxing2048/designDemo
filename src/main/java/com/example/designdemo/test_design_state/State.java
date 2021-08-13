package com.example.designdemo.test_design_state;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description  状态模式核心类
 *  状态模式就两点：
 * 1、可以通过改变状态来获得不同的行为。
 * 2、你的好友能同时看到你的变化
 * @createTime 2021年08月12日 11:11:00
 */
public class State {
    private String value;

    public State(){

    }
    public State(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("the first execute opt");
    }

    public void method2(){
        System.out.println("the second execute opt");
    }
}
