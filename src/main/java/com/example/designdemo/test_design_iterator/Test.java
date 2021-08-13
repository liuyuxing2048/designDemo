package com.example.designdemo.test_design_iterator;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 貌似模拟了一个集合类的过程，感觉是不是很爽？
 * 其实JDK中各个类也都是这些基本的东西，加一些设计模式，
 * 再加一些优化放到一起的，只要我们把这些东西学会了，
 * 掌握好了，我们也可以写出自己的集合类，甚至框架！
 * @createTime 2021年08月11日 17:57:00
 */
public class Test {
    public static void main(String[] args) {
        Collection myCollection = new MyCollection();
        Iterator iterator = myCollection.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
