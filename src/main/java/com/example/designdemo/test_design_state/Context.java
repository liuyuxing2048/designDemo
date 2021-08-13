package com.example.designdemo.test_design_state;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description TODO
 * @createTime 2021年08月12日 11:22:00
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method(){
        if(state.getValue().equals("1")){
            state.method1();
        } else if(state.getValue().equals("2")){
            state.method2();
        }else{
            System.out.println("faild");
        }
    }
}
