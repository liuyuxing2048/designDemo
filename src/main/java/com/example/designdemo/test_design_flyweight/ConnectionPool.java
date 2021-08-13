package com.example.designdemo.test_design_flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @author liuyuxing
 * @version 5.0.0
 * @Description 享元模式的主要目的是实现对象的共享，即共享池，
 *              当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用。
 *              FlyWeight
 * @createTime 2021年08月11日 16:35:00
 */
public class ConnectionPool {

    private Vector<Connection> pool;

    // 共有属性
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "l090201L";
    private String driverClassName = "com.mysql.cj.jdbc.Driver";

    private int poolSize = 100;
    private static ConnectionPool instance = null;
    Connection conn = null;

    // 构造方法 初始化连接池
    private ConnectionPool(){
        pool = new Vector<>(poolSize);

        for (int i = 0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url,username,password);
                pool.add(conn);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    // 返回连接到连接池
    public synchronized void release(){
        pool.add(conn);
    }

    // 返回连接池中的一个数据库连接
    public synchronized Connection getConnection(){
        if(pool.size()>0){
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool();
        Connection connection = connectionPool.getConnection();
        System.out.println(connection);
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("select * from sys_user");
            int i = preparedStatement.executeUpdate();
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
