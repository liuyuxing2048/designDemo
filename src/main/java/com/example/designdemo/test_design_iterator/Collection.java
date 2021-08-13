package com.example.designdemo.test_design_iterator;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 集合的一些操作
 * 迭代器模式就是顺序访问聚集中的对象
 * 一是需要遍历的对象，即聚集对象，二是迭代器对象，用于对聚集对象进行遍历访问
 * @createTime 2021年08月11日 17:49:00
 */
public interface Collection {

    public Iterator iterator();

    public Object get(int index);

    public int size();
}
