package com.example.designdemo.test_design_iterator;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 迭代的一些操作
 * @createTime 2021年08月11日 17:49:00
 */
public interface Iterator {

    Object previous();

    Object next();

    boolean hasNext();

    Object first();

}
