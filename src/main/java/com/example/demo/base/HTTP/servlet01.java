package com.example.demo.base.HTTP;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用来测试response的重定向的01
 */
@WebServlet("/01")
public class servlet01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("请求到了servlet01");
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //平日开发不用这种写法, 用sendRedirect()
//        resp.setStatus(302);
//        resp.setHeader("location", "/02");

        //重定向到servlet02
        resp.sendRedirect("/02");
    }
}
