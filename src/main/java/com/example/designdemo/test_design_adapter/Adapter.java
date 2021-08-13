package com.example.designdemo.test_design_adapter;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 类的适配器模式
 * @createTime 2021年08月11日 14:45:00
 */
public class Adapter extends Source implements Targetable{

    @Override
    public void method2() {
        System.out.println("this is targetable method");
    }

    public static void main(String[] args) {
        //Targetable接口的实现类就具有了Source类
        Adapter adapter = new Adapter();
        adapter.method1();
        adapter.method2();
    }
}
