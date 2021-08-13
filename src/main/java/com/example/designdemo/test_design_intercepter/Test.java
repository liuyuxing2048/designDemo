package com.example.designdemo.test_design_intercepter;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等！
 * @createTime 2021年08月12日 13:49:00
 */
public class Test {
    public static void main(String[] args) {
        // 计算
        int minus = new Minus().interpret(new Context(9, 2));
        int plus = new Plus().interpret(new Context(9, 2));
        int result = new Minus().interpret(new Context(
                new Plus().interpret(new Context(9,3)),3
        ));
        System.out.println(minus + "--" + plus + "--" + result);
    }
}
