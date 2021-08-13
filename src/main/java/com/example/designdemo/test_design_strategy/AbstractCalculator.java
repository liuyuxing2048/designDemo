package com.example.designdemo.test_design_strategy;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 辅助类
 * @createTime 2021年08月11日 16:54:00
 */
public class AbstractCalculator {
    public int[] split(String exp,String opt){
        String[] array = exp.split(opt);
        int[] intArray = new int[2];
        intArray[0] = Integer.parseInt(array[0]);
        intArray[1] = Integer.parseInt(array[1]);
        return intArray;
    }
}
