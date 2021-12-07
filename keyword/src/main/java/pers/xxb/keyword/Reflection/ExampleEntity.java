package pers.xxb.keyword.Reflection;

public class ExampleEntity {

    //成员变量
    String str;
    int i,i2,i3;

    //构造方法
    private ExampleEntity() {
    }
//    protected ExampleEntity(String str,int i){
//        this.str = str;
//        this.i = i;
//    }
//    public ExampleEntity(String... strings){
//
//    }

    //方法
    public void print(){
        System.out.println("str=" + str);
        System.out.println("i1=" + i);
        System.out.println("i2=" + i2);
        System.out.println("i3=" + i3);
    }

}
