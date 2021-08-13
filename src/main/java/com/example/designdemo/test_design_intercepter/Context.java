package com.example.designdemo.test_design_intercepter;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description Context类是一个上下文环境类
 * @createTime 2021年08月12日 13:47:00
 */
public class Context {

    private int num1;
    private int num2;

    public Context(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
