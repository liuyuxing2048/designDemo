package com.example.designdemo.test_design_command;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 司令员 - 发出指令 等待结果
 * @createTime 2021年08月12日 10:50:00
 */
public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.exec();
    }

}
