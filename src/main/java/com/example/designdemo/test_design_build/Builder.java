package com.example.designdemo.test_design_build;

import com.gaea.gaea_security.test_design_factory.Mail;
import com.gaea.gaea_security.test_design_factory.SimpleSend;
import com.gaea.gaea_security.test_design_factory.Sms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 建造者模式:将各种产品集中起来进行管理，用来创建复合对象，所谓复合对象就是指某个类具有不同的属性
 * @createTime 2021年08月11日 14:23:00
 */
public class Builder {
    private List<SimpleSend> list = new ArrayList<>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new Mail());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new Sms());
        }
    }

    public static void main(String[] args) {
        // Testing
        Builder builder = new Builder();
        builder.produceMailSender(5);
        for (SimpleSend simpleSend : builder.list) {
            System.out.println(simpleSend);
        }
    }
}
