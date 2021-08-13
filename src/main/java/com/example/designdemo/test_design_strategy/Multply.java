package com.example.designdemo.test_design_strategy;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 乘法策略
 * @createTime 2021年08月11日 16:56:00
 */
public class Multply extends AbstractCalculator implements ICalculator{
    @Override
    public int calculate(String exp) {
        int[] split = split(exp, "\\*");
        return split[0] * split[1];
    }
}
