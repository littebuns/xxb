package com.example.demo.base.HTTP;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * response重定向的02
 * 输出数据流
 */
@WebServlet("/02")
public class servlet02 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("重定向到了servlet02");
        //获取流对象之前，设置流的默认编码
//        resp.setCharacterEncoding("utf-8");
        //告诉浏览器该使用什么字符集进行解码
        resp.setHeader("content-type", "text/html;charset=utf-8");

        //resp.setContentType("text/html;charset=utf-8");

//        //获取数据输出流
//        PrintWriter pw = resp.getWriter();
//        //输出数据
//        pw.write("你好，hello response");
//

//        输出字节
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.write("hello".getBytes());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
