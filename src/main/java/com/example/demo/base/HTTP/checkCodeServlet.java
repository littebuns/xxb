package com.example.demo.base.HTTP;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * 验证码的实现
 */
@WebServlet("/checkCode")
public class checkCodeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int width = 100;
        int height = 50;
        //创建对象,在内存中的图片
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        //美化图片
        //2.1 填充背景色
        Graphics g = image.getGraphics();
        g.setColor(Color.pink);
        g.fillRect(0, 0, width, height);

        //2.2 画边框
        g.setColor(Color.BLUE);
        g.drawRect(0, 0, width - 1, height - 1);

        //2.3 画验证码
        String str = "ABCDEFGHIJK";
        Random ran = new Random();
        for (int i = 1 ; i <= 4; i++){
            int index = ran.nextInt(str.length());
            char ch = str.charAt(index);
            g.drawString(ch + "", width/5 * i , height/2);
        }

        //画干扰线
        g.setColor(Color.GREEN);
        for (int i = 0; i < 8; i ++){
            int x1 = ran.nextInt(width);
            int x2 = ran.nextInt(width);

            int y1 = ran.nextInt(height);
            int y2 = ran.nextInt(height);
            g.drawLine(x1, y1, x2, y2);
        }

        //将内存中的图片输出到页面上
        ImageIO.write(image, "jpg", resp.getOutputStream());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
