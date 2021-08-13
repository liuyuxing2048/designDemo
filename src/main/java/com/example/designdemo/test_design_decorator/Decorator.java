package com.example.designdemo.test_design_decorator;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 装饰类
 * 装饰器模式的应用场景：
 * 1、需要扩展一个类的功能。
 * 2、动态的为一个对象增加功能，而且还能动态撤销。
 * （继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 * @createTime 2021年08月11日 15:02:00
 */
public class Decorator implements Sourceable{

    private Sourceable sourceable;

    public Decorator(Sourceable sourceable){
        this.sourceable = sourceable;
    }
    @Override
    public void method() {
        System.out.println("before decorator!");
        sourceable.method();
        System.out.println("after decorator!");
    }

    public static void main(String[] args) {
        Sourceable source = new Source();
        // 把source进行了增强
        Sourceable obj = new Decorator(source);
        obj.method();

    }
}
