package com.example.designdemo.test_design_factory;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 普通工厂V2
 * @createTime 2021年08月09日 10:20:00
 */
public class SendFactoryV2 {
    public SimpleSend produceMail(){
        return new Mail();
    }

    public SimpleSend produceSms(){
        return new Sms();
    }

    public static void main(String[] args) {
        SendFactoryV2 sendFactoryV2 = new SendFactoryV2();
        sendFactoryV2.produceMail().sendMessage();
        sendFactoryV2.produceSms().sendMessage();
    }
}
