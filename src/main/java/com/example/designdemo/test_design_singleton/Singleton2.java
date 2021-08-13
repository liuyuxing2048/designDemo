package com.example.designdemo.test_design_singleton;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 线程安全
 * @createTime 2021年08月11日 14:03:00
 */
public class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2(){

    }

    /**
     * 加在方法上 消耗的性能太高
     * @return
     */
//    public synchronized Singleton2 getInstance() {
    public Singleton2 getInstance() {
        if(instance == null){
            synchronized(instance){
                instance = new Singleton2();
            }
        }
        return instance;
    }
}
