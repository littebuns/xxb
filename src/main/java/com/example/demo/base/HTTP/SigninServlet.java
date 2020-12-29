package com.example.demo.base.HTTP;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/signin")
public class SigninServlet extends  HttpServlet{


    public static final Map<String, String> users = new HashMap<String, String>(){
        {
            put("xxb", "123");
            put("hxt", "123");
        }
    };

    // GET请求时显示登录页:
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.write("<h1>Sign In</h1>");
        pw.write("<form action=\"/signin\" method=\"post\">");
        pw.write("<p>Username: <input name=\"username\"></p>");
        pw.write("<p>Password: <input name=\"password\" type=\"password\"></p>");
        pw.write("<p><button type=\"submit\">Sign In</button> <a href=\"/\">Cancel</a></p>");
        pw.write("</form>");
        pw.flush();
    }

    // POST请求时处理用户登录:
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String name = req.getParameter("username");
            String password = req.getParameter("password");
            String expectedPassword = users.get(name.toLowerCase());
            if (expectedPassword != null && expectedPassword.equals(password)) {
                // 登录成功:
                req.getSession().setAttribute("user", name);
                resp.sendRedirect("/index");
            } else {
                resp.sendError(HttpServletResponse.SC_FORBIDDEN);
            }
        }

}
