package com.example.designdemo.test_design_factory;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 静态工厂
 * @createTime 2021年08月09日 10:22:00
 */
public class SendStaticFactory {
    public static SimpleSend produceSms(){
        return new Sms();
    }
    public static SimpleSend produceMail(){
        return new Mail();
    }

    public static void main(String[] args) {
        SendStaticFactory.produceSms().sendMessage();
        SendStaticFactory.produceMail().sendMessage();
    }
}
