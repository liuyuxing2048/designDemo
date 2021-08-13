package com.example.designdemo.test_design_singleton;

import java.util.Vector;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 线程安全 优化 属性同步
 * @createTime 2021年08月11日 14:03:00
 */
public class Singleton4 {
    private static Singleton4 instance = null;
    private Vector properties = null;

    private Singleton4(){

    }

    private Vector getProperties(){
        return properties;
    }

    public static Singleton4 getInstance() {
        if(instance == null){
            sysInit();
        }
        return instance;
    }

    private static synchronized void sysInit() {
        if(instance == null){
            instance = new Singleton4();
        }
    }

    public void updateProperties(){
        // 传入的对象
        Singleton4 singleton4 = new Singleton4();
        // 设置属性
        properties = singleton4.getProperties();
    }
}
