package com.example.designdemo.test_design_adapter;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 对象的适配器模式
 * @createTime 2021年08月11日 14:47:00
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper (Source source){
        super();
        this.source = source;
    }
    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    public static void main(String[] args) {
        // 持有Source类的实例，以达到解决兼容性的问题
        Wrapper wrapper = new Wrapper(new Source());
        wrapper.method1();
        wrapper.method2();
    }
}
