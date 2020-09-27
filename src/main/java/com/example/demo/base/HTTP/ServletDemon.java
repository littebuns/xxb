package com.example.demo.base.HTTP;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/servlet")
public class ServletDemon extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(req.getParameter("params"));
        req.setCharacterEncoding("UTF-8");
        BufferedReader reader = req.getReader();
        String lines = null;
        while (null != (lines = reader.readLine())){
            System.out.println(lines);
        }
    }
}
