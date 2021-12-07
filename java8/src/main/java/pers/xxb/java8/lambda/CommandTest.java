package pers.xxb.java8.lambda;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class CommandTest {

    /**
     * 正常采用匿名内部类的方式调用
     */
    @Test
    public void t1(){
        int[] a = {1,2,3,4};
        ProcessArray processArray = new ProcessArray();
        //调用 process 方法才知道要求和
        processArray.process(a, new Command() {
            @Override
            public void process(int[] target) {
                int sum = 0;
                for (int i : a) {
                    sum += i;
                }
                log.info("数组和为{}", sum);
            }
        });
    }

    /**
     * 通过 lambda 表达式优化代码
     */
    @Test
    public void t2(){
        int[] a = {1,2,3,4};
        ProcessArray processArray = new ProcessArray();
        processArray.process(a, target -> {
            int sum = 0;
            for (int i : target) {
                sum += i;
            }
            log.info("数组和为{}", sum);
        });
    }


}
