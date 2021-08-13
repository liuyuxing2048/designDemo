package com.example.designdemo.test_design_intercepter;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 计算的实现
 * @createTime 2021年08月12日 13:48:00
 */
public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
