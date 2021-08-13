package com.example.designdemo.test_design_factory;

import java.util.Iterator;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description TODO
 * @createTime 2021年08月10日 11:22:00
 */
public class MyArrayList<T> implements Iterable<T> {
    private Object[] elements;
    private int size = 0;

    public MyArrayList(int capacity) {
        this.elements = new Object[capacity];
    }

    public MyArrayList() {
        this(10);
    }

    public void add(T obj) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                elements[i] = obj;
                this.size++;
                break;
            }
            // 扩容
            if(elements[elements.length-1] != null){
                // 定于新的数组 并拷贝内容
                Object[] newElements = new Object[elements.length*2];
                System.arraycopy(elements, 0, newElements, 0, elements.length);
                elements = newElements;
            }
        }
    }

    public void remove(T obj){
        for (int i = elements.length - 1; i >= 0; i--) {
            if(elements[i] == obj){
                elements[i] = null;
                this.size--;
                break;
            }
        }
    }

    public T get(int index){
        if(index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException("越界");
        }
        return (T) elements[index];
    }

    public int size(){
        return this.size;
    }

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0; i < 101; i++) {
            list.add(i);
        }
        System.out.println("---<" + list.get(101));
//        new ArrayList<>();
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return elements[index]!=null;
            }

            @Override
            public T next() {
                return (T)elements[index++];
            }
        };

    }
}
