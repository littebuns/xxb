package personal.xxb.oop.exception;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author  xxb
 * @create  2021/12/29 17:17
 * @desc  java7 自动关闭资源
 **/
public class AutoCloseTest {

    @Test
    public void t1() throws IOException {
        FileReader reader = new FileReader("src/personal/xxb/oop/exception/test.txt");
    }

}
