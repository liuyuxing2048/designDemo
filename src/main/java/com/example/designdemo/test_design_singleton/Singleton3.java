package com.example.designdemo.test_design_singleton;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 线程安全 优化
 * @createTime 2021年08月11日 14:03:00
 */
public class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3(){

    }

    public static Singleton3 getInstance() {
        if(instance == null){
            sysInit();
        }
        return instance;
    }

    private static synchronized void sysInit() {
        if(instance == null){
            instance = new Singleton3();
        }
    }
}
