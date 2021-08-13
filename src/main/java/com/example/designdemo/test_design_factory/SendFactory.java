package com.example.designdemo.test_design_factory;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 普通工厂V1
 * @createTime 2021年08月09日 10:17:00
 */
public class SendFactory {

    public SimpleSend produce(String type){
        if("mail".equals(type)){
            return new Mail();
        }else if("sms".equals(type)){
            return new Sms();
        }else{
            System.out.println("type Fail!");
            return null;
        }

    }

    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        SimpleSend mail = sendFactory.produce("mail");

        mail.sendMessage();
    }
}
