package com.example.designdemo.test_design_facade;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 类之间的关系被放在了Computer类里，这样就起到了解耦的作用，这-就是外观模式
 * @createTime 2021年08月11日 15:23:00
 */
public class Computer {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup(){
        System.out.println("computer start");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("computer start finished");
    }

    public void shutdown(){
        System.out.println("computer shutdown");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer shutdown finished");
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
