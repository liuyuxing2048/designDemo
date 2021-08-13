package com.example.designdemo.test_design_mediator;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 中介者模式也是用来降低类类之间的耦合的，
 * 因为如果类类之间有依赖关系的话，不利于功能的拓展和维护，
 * 因为只要修改一个对象，其它关联的对象都得进行修改。如果使用中介者模式，
 * 只需关心和Mediator类的关系，具体类类之间的关系及调度交给Mediator就行，
 * 这有点像spring容器的作用
 * @createTime 2021年08月12日 13:25:00
 */
public interface Mediator {
    void createMediator();
    void workAll();
}
