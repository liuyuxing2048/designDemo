package com.example.designdemo.test_design_command;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 指令 - 找到士兵 给他操作的指令
 * @createTime 2021年08月12日 10:48:00
 */
public class MyCommand implements Command{

    private Receiver receiver;

    public MyCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.action();
    }
}
