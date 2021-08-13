package com.example.designdemo.test_design_intercepter;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 解释器模式： 要应用在OOP开发中的编译器的开发中，所以适用面比较窄
 * @createTime 2021年08月12日 13:45:00
 */
public interface Expression {
    int interpret(Context context);
}
