package com.example.designdemo.test_design_prototype;

import java.io.*;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 深克隆
 * @createTime 2021年08月11日 14:33:00
 */
public class Prototype2 implements Cloneable, Serializable {
    public static final long serialVersionUID = 1L;
    private String str;
    private SerializableObject obj;

    class SerializableObject implements Serializable {
        private static final long serialVersionUID = 1L;
    }

    /**
     * 浅复制
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Prototype2) super.clone();
    }

    public Object depClone() throws IOException, ClassNotFoundException {
        // 写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bos);
        oo.writeObject(this);

        // 读取二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bis);
        return oi.readObject();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }
}
