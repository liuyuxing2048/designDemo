package com.example.designdemo.test_design_factory;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description Sms抽象工厂
 * @createTime 2021年08月11日 13:52:00
 */
public class SmsFactoryProvider implements Provider{
    @Override
    public SimpleSend produce() {
        return new Sms();
    }
}
