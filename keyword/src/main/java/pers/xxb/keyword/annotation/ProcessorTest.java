package pers.xxb.keyword.annotation;

import lombok.extern.slf4j.Slf4j;
import pers.xxb.keyword.annotation.anno.Testable;

import java.lang.reflect.Method;

@Slf4j
public class ProcessorTest {

    public static void process(String clazz) throws ClassNotFoundException {

        int success = 0;
        int failed = 0;

        for (Method method : Class.forName(clazz).getMethods()) {
            if (method.isAnnotationPresent(Testable.class)){
                try {
                    MyTest myTest = new MyTest();
                    method.invoke(myTest);
                    success++;
                }catch (Exception e){
                    log.error("{}方法测试失败", method, e);
                    failed++;
                }
            }
        }
      log.info("测试结束,共运行方法{}个, 成功{}个，失败{}个", (success + failed), success, failed);

    }

    public static void main(String[] args) throws ClassNotFoundException {
        process("pers.xxb.keyword.annotation.MyTest");
    }

}
