package com.example.designdemo.test_design_strategy;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 策略模式统一的接口
 * @createTime 2021年08月11日 16:51:00
 * 策略模式定义了一系列算法，并将每个算法封装起来，
 * 使他们可以相互替换，且算法的变化不会影响到使用算法的客户。
 * 需要设计一个接口，为一系列实现类提供统一的方法，多个实现类实现该接口，
 * 设计一个抽象类（可有可无，属于辅助类），提供辅助函数，
 */
public interface ICalculator {
    int calculate(String exp);
}
