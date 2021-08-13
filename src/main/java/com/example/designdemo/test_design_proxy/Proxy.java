package com.example.designdemo.test_design_proxy;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 代理类
 * @createTime 2021年08月11日 15:14:00
 */
public class Proxy implements Sourceable{

    private Source source;

    public Proxy(){
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        System.out.println("proxy before");
        source.method();
        System.out.println("proxy after");
    }

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.method();
    }
    /**
     * 代理模式的应用场景：
     *
     * 如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：
     * 1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。
     * 2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。
     * 使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
     */

    /**
     * 和装饰模式的区别
     * 1、装饰器模式强调的是增强自身，在被装饰之后你能够在被增强的类上使用增强后的功能。
     *  增强后你还是你，只不过能力更强了而已；代理模式强调要让别人帮你去做一些本身与你业务没有太多关系的职责（记录日志、设置缓存）。
     *  代理模式是为了实现对象的控制，因为被代理的对象往往难以直接获得或者是其内部不想暴露出来。
     *
     * 2、装饰模式是以对客户端透明的方式扩展对象的功能，是继承方案的一个替代方案；
     *  代理模式则是给一个对象提供一个代理对象，并由代理对象来控制对原有对象的引用；
     *
     * 3、装饰模式是为装饰的对象增强功能；而代理模式对代理的对象施加控制，
     *  但不对对象本身的功能进行增强；
     */
}
