package com.example.demo.base.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class CopyTest {

    public static void main(String[] args) throws Exception{

//        String buffer = "";
//        FileInputStream is = new FileInputStream("C:\\Users\\HP\\Desktop\\1.txt");
//        String line;
//        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//        line = reader.readLine();
//        while (line != null){
//            buffer += line;
//            line = reader.readLine();
//        }

        String str = "@Test  public void t0(){   int i = 1;}   ";
        String result = "";
        for (int i = 0; i < 268; i++) {
            String s = str.replaceAll("t0", "t" + i);
            result += s;
        }
        System.out.println(result);


    }
}
