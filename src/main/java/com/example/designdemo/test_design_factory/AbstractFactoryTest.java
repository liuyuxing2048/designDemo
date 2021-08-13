package com.example.designdemo.test_design_factory;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 抽象工厂测试类
 * @createTime 2021年08月11日 13:53:00
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        Provider provider = new SmsFactoryProvider();
        provider.produce().sendMessage();
        provider = new MailFactoryProvider();
        provider.produce().sendMessage();
    }
}
