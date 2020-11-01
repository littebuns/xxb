package com.example.demo.utils.jdbc;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 抽取jdbc中连接和释放资源的操作
 */
public class JDBCUtils {

    private static String url;
    private static String user;
    private static String password;

    /**
     * 动态读取配置文件路径，获取其中值
     */
    static {
        try {
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            InputStream in = classLoader.getResourceAsStream("config/jdbc.properties");
            Properties pro = new Properties();
            pro.load(in);
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    /**
     * 获取连接对象
     * @return
     */
    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * 释放资源
     */
    public static void close(Statement stmt, Connection conn){
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs, Statement stmt, Connection conn){
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
