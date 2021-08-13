package com.example.designdemo.test_design_command;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 命令模式的目的就是达到命令的发出者和执行者之间解耦，
 * 实现请求和执行分开，熟悉Struts的同学应该知道，
 * Struts其实就是一种将请求和呈现分离的技术，其中必然涉及命令模式的思想！
 * @createTime 2021年08月12日 10:52:00
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
