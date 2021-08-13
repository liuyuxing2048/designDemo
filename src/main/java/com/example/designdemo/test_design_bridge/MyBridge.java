package com.example.designdemo.test_design_bridge;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description TODO
 * @createTime 2021年08月11日 15:56:00
 */
public class MyBridge extends Bridge{
    @Override
    public void method(){
        getSource().method();
    }

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        // one
        Sourceable sourceSub1 = new SourceSub1();
        bridge.setSource(sourceSub1);
        bridge.method();

        // two
        Sourceable sourceSub2 = new SourceSub2();
        bridge.setSource(sourceSub2);
        bridge.method();
    }
    /**
     * 过对Bridge类的调用，实现了对接口Sourceable的实现类
     * SourceSub1和SourceSub2的调用。
     * 接下来我再画个图，大家就应该明白了，
     * 因为这个图是我们JDBC连接的原理，有数据库学习基础的，一结合就都懂了
     * client > driverManager > Driver[MysqlDriver,OracleDriver]
     */
}
