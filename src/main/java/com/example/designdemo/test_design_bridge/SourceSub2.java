package com.example.designdemo.test_design_bridge;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description TODO
 * @createTime 2021年08月11日 15:53:00
 */
public class SourceSub2 implements Sourceable{
    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }

}
