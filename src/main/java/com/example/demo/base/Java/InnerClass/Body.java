package com.example.demo.base.Java.InnerClass;

public class Body { //外部类

    private String name;

    public class Heart{ //成员内部类

        //内部类的方法
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我是" + name + "的心脏");  //内部类访问外部类
        }
    }

    //外部类的方法
    public void methodBody(){
        System.out.println("身体");
        //匿名对象 外部类的方法使用内部类
        new Heart().beat();
    }


    public static void main(String[] args) {
        Body body = new Body();
        //通过外部类对象间接使用内部类Heart
        body.methodBody();

        System.out.println("=============");

        //直接使用内部类
        Heart heart = new Body().new Heart();
        heart.beat();

    }
}
