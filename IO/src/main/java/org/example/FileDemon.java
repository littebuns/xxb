package org.example;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileDemon {


    public static void main(String[] args) {
        String separator = File.separator;


    }

    @Test
    public void getFile() throws IOException {
        System.out.println(System.getProperty("user.dir"));
        File file = new File("src\\main\\resources\\file.text");
        System.out.println(file.exists());
        File file1 = new File("src\\main\\java\\org\\example\\file.text");
        System.out.println(file1.isFile());
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getCanonicalPath());
    }




}
