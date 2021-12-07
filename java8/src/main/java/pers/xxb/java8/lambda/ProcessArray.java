package pers.xxb.java8.lambda;

/**
 * 处理数组的类
 * 这个处理的行为是不确定的
 */
public class ProcessArray {

    /**
     * 只有在调用 process 方法时才知道处理数组的行为
     */
    public void process(int[] target, Command command){
        command.process(target);
    }

}
