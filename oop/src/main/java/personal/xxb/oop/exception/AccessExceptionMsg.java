package personal.xxb.oop.exception;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Slf4j
public class AccessExceptionMsg {

    @Test
    public void t1(){
        try {
            FileInputStream fileInputStream = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            log.info(e.getMessage());
            e.printStackTrace();
        }
    }

}
