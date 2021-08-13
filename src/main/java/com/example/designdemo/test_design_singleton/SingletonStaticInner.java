package com.example.designdemo.test_design_singleton;

import java.io.Serializable;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 使用内部类实现单例模式
 * @createTime 2021年08月12日 10:28:00
 */
public class SingletonStaticInner implements Serializable {

    private SingletonStaticInner() {

    }

    public static SingletonStaticInner getInstance(){
        return SingleInner.singletonStaticInner;
    }

    public static class SingleInner{
        public static SingletonStaticInner singletonStaticInner = new SingletonStaticInner();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(SingletonStaticInner.getInstance());
            }).start();
        }
    }
}
