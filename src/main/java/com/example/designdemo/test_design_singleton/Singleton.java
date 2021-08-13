package com.example.designdemo.test_design_singleton;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 简单单例类
 * @createTime 2021年08月11日 14:00:00
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton(){

    }

    public Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
