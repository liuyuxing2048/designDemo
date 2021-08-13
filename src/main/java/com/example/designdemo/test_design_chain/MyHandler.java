package com.example.designdemo.test_design_chain;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 有多个对象，每个对象持有对下一个对象的引用，
 * 这样就会形成一条链，请求在这条链上传递，直到某一对象决定处理该请求。
 * 责任链模式可以实现，在隐瞒客户端的情况下，对系统进行动态的调整
 * @createTime 2021年08月12日 10:39:00
 */
public class MyHandler extends AbstractHandler implements Handler{
    private String name;

    public MyHandler(String name){
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + "deal!");
        if(getHandler() != null){
            getHandler().operator();
        }
    }
}
