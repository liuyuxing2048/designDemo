package com.example.designdemo.test_design_bridge;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 定义一个桥，持有Sourceable的一个实例：
 * @createTime 2021年08月11日 15:55:00
 */
public abstract class Bridge {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource(){
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
