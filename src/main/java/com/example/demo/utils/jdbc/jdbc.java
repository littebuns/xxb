package com.example.demo.utils.jdbc;

import java.sql.*;

/**
 * jdbc连接
 */
public class jdbc {


    public static void main(String[] args) {
        PreparedStatement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
//        Class.forName("com.mysql.com.example.demo.utils.jdbc.Driver");
//            conn = DriverManager.getConnection("com.example.demo.utils.jdbc:mysql://localhost:3306/xxb?serverTimezone=UTC", "root", "123456");
            String sql = "select * from person where age = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "xxb");
            boolean result = stmt.execute();
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
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


}
