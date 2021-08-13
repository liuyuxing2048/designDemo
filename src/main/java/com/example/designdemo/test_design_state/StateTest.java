package com.example.designdemo.test_design_state;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description TODO
 * @createTime 2021年08月12日 11:24:00
 */
public class StateTest {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);
        // 1
        state.setValue("1");
        context.method();
        // 2
        state.setValue("2");
        context.method();
    }
    /**
     * 根据这个特性，状态模式在日常开发中用的挺多的，
     * 尤其是做网站的时候，我们有时希望根据对象的某一属性，区别开他们的一些功能，
     * 比如说简单的权限控制等
     */
}
