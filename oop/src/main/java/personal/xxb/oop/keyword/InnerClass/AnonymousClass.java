package personal.xxb.oop.keyword.InnerClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class AnonymousClass {

    //定义了一个greeting接口
    interface greeting {
        void sayHello();
    }

    public void greeting() {

        /**
         * 正常方式
         * 1.新建一个类实现greeting接口
         * 2.重写sayHello()方法
         * 3.用多态,来创建一个greeting的实例
         * 4.调用sayHello()
         */
        //匿名内部类
        greeting dogGreet = new greeting() {
            @Override
            public void sayHello() {
                System.out.println("汪");
            }
        };
        dogGreet.sayHello();
    }


    public static void main(String[] args) {
        AnonymousClass test = new AnonymousClass();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(System.currentTimeMillis()));
        test.greeting();
    }

}
