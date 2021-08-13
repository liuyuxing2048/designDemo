package com.example.designdemo.test_design_template;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 加
 * @createTime 2021年08月11日 17:23:00
 */
public class Plus extends AbstractCalculator{
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Test
        String exp = "89+89";
        AbstractCalculator cal = new Plus();
        System.out.println(cal.calculate(exp, "\\+"));
        /**
         * 首先将exp和"\\+"做参数，调用AbstractCalculator类里的calculate(String,String)
         * 方法，在calculate(String,String)里调用同类的split()，
         * 之后再调用calculate(int ,int)方法，从这个方法进入到子类中，
         * 执行完return num1 + num2后，将值返回到AbstractCalculator类，
         * 赋给result，打印出来。
         */
    }
}
