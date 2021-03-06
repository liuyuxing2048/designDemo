package com.example.designdemo.test_design_prototype;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 原型模式 : 将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
 * @createTime 2021年08月11日 14:28:00
 */
public class Protortype implements Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        Protortype protortype = (Protortype) super.clone();
        return protortype;
    }

    public static void main(String[] args) {
        Protortype protortype = new Protortype();
        System.out.println(protortype);
        try {
            Object clone = protortype.clone();
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
