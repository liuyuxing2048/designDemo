package com.example.designdemo.test_design_observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description TODO
 * @createTime 2021年08月11日 17:37:00
 */
public abstract class AbstractSubject implements Subject{

    private Vector<ObServer> vector = new Vector<>();

    @Override
    public void add(ObServer obServer) {
        vector.add(obServer);
    }

    @Override
    public void remove(ObServer obServer) {
        vector.add(obServer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<ObServer> elements = vector.elements();
        while (elements.hasMoreElements()){
            elements.nextElement().update();
        }
    }
}
