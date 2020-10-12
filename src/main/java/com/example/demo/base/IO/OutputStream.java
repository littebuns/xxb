package com.example.demo.base.IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream：文件字节输出流
 * 把内存中的数据写入到硬盘的文件中
 */
public class OutputStream {

    public static void main(String[] args) throws IOException {
        /**
         * 该构造方法有3个作用：
         * 1.创建一个FileOutputStream对象
         * 2.会根据构造方法中传递的文件/文件路径,创建一个空的文件
         * 3.会把FileOutputStream对象指向创建好的文件
         */
        FileOutputStream fos = new FileOutputStream("xxb\\a.txt");
        fos.write(997);
        fos.close();
    }
}
