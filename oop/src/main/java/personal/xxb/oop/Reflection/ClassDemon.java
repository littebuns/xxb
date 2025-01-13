package personal.xxb.oop.Reflection;

import org.junit.Test;

/**
 * 除了基本类型外 java其他的类型都为class
 *
 * 当JVM第一次读取到一种 class 类型时  会创建一个 Class 实例到内存中
 *
 */
public class ClassDemon {


    /**
     * 获取
     */
    @Test
    public void getClassDemon() throws ClassNotFoundException {
        //通过类名获取
        Class<String> cls1 = String.class;

        //通过实例对象获取
        String str = "a";
        Class<? extends String> cls2 = str.getClass();

        //通过Class的静态方法获取
        Class<?> cls3 = Class.forName("java.lang.String");


    }


}
