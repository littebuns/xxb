package personal.xxb.oop.exception;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class MultiException {

    @Test
    public void t1(){
        try {
            int a = 1;
            int b = 0;
            int c = a/b;
            log.info("结果为{}", c);
        }catch (NumberFormatException|ArithmeticException e1){
            log.error("error", e1);
            //Cannot assign a value to final variable 'e1',说明已被final修饰
//            e1 = new ArithmeticException();
        }catch (Exception e2){
            log.error("其他异常", e2);
            //捕获一种异常时，没有被 final 修饰
            e2 = new Exception();
        }

    }



}
