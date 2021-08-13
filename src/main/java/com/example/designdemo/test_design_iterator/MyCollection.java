package com.example.designdemo.test_design_iterator;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description TODO
 * @createTime 2021年08月11日 17:52:00
 */
public class MyCollection implements Collection {

    private String[] strings = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int index) {
        return strings[index];
    }

    @Override
    public int size() {
        return strings.length;
    }
}
