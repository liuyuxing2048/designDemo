package com.example.designdemo.test_design_template;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 模板设计模式:重写抽象方法，通过调用抽象类，实现对子类的调用
 * @createTime 2021年08月11日 17:19:00
 */
public abstract class AbstractCalculator {

    /*主方法，实现对本类其它方法的调用*/
    public final int calculate(String exp,String opt){
        int array[] = split(exp, opt);
        return calculate(array[0],array[1]);
    }

    /*被子类重写的方法*/
    abstract public int calculate(int num1,int num2);

    public int[] split(String exp,String opt){
        String[] array = exp.split(opt);
        int[] intArray = new int[2];
        intArray[0] = Integer.parseInt(array[0]);
        intArray[1] = Integer.parseInt(array[1]);
        return intArray;
    }

}
