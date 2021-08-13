package com.example.designdemo.test_design_factory;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description Mail抽象工厂
 * @createTime 2021年08月11日 13:53:00
 */
public class MailFactoryProvider implements Provider{
    @Override
    public SimpleSend produce() {
        return new Mail();
    }
}
