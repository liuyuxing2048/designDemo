package com.example.designdemo.test_design_memento;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description TODO
 * @createTime 2021年08月12日 11:01:00
 */
public class MemtoTest {
    public static void main(String[] args) {
        // 创建原始类
        Original egg = new Original("egg");
        // 创建备忘录存储类 - 把原始类的备忘录进行了一次存储
        Storage storage = new Storage(egg.createMemento());

        // 修改原始类的状态
        System.out.println("init state:" + egg.getValue());
        egg.setValue("milk");
        System.out.println("change state；" + egg.getValue());
        // 再次备份 >
        //storage = new Storage(egg.createMemento());

        // 恢复原始类的状态
        egg.restoreMemento(storage.getMemento());
        System.out.println("cover state:" + egg.getValue());

    }
    /**
     *  新建原始类时，value被初始化为egg，后经过修改，
     *  将value的值置为niu，最后倒数第二行进行恢复状态，结果成功恢复了。
     *  其实我觉得这个模式叫“备份-恢复”模式最形象
     */
}
