package com.example.demo.base.importClass.Enum;

public class SimpleEnumUse {

    private Spiciness degree;

    private SimpleEnumUse(Spiciness degree) {
        this.degree = degree;
    }

    private void describe(){
        switch (degree) {
            case NOT:
                System.out.println("not spicy at all");
                break;
            case MILD:
                System.out.println("a little hot");
                break;
            case MEDIUM:
                System.out.println("maybe a little");
                break;
            case HOT:
                System.out.println("too hot");
                break;
            case FLAMING:
                break;
        }
    }

    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);

        //创建枚举会创建ordinal()方法，表明声明顺序
        for (Spiciness s : Spiciness.values()){
            System.out.println(s + ", ordinal:" + s.ordinal());
        }

        //枚举一般配合switch case使用
        SimpleEnumUse
                s1 = new SimpleEnumUse(Spiciness.NOT),
                s2 = new SimpleEnumUse(Spiciness.MEDIUM),
                s3 = new SimpleEnumUse(Spiciness.HOT);

        s1.describe();
        s2.describe();
        s3.describe();
    }
}
