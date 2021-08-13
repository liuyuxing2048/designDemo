package com.example.designdemo.test_design_singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description TODO
 * @createTime 2021年08月12日 10:01:00
 */
public class SingletonStaticIn implements Serializable{

    // 使用容器化的方式实现单例
    static Map<String,SingletonStaticIn> stringSingletonStaticInMap = new ConcurrentHashMap<>();

    static boolean flag = false;

    private SingletonStaticIn(){
        System.out.println(11);
        // 防止反射破坏单例
        if(flag){
            throw new RuntimeException("不能创建");
        }else{
            flag = true;
        }

    }

    public static SingletonStaticIn getInstance(String key){
        return stringSingletonStaticInMap
                .computeIfAbsent(key,(k)->new SingletonStaticIn());
    }


    /**
     * 防止序列化创建对象
     * @param s
     */
    private void writeObject(ObjectOutputStream s){
        throw new RuntimeException("sadf");
    }

    public static void main(String[] args) throws Exception {
        SingletonStaticIn instance = SingletonStaticIn.getInstance("a");
        System.out.println(instance);
        // 序列化对象 > 破坏单例
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(instance);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        System.out.println(objectInputStream.readObject());


    }

    /**
     * 使用反射破坏单例
     * @return
     */
    public static SingletonStaticIn pohuai(){
        try {
            Constructor<SingletonStaticIn> constructor = SingletonStaticIn.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
