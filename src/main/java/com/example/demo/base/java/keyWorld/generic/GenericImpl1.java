package com.example.demo.base.java.keyWorld.generic;

import com.example.demo.entity.Dog;

/**
 * 外界使用子类的时候，需要传递类型参数变量进来
 * 在实现类上需要定义出类型参数变量<T>
 * @param <T>
 */
public class GenericImpl1<T> implements Generic<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }


    public static void main(String[] args) {
        //子类知道泛型的类型
        GenericImpl generic = new GenericImpl();
        generic.show(2);

        //子类不知道泛型的类型，需要自己传递
        GenericImpl1<Dog> impl1 = new GenericImpl1<>();
        impl1.show(new Dog("hxt"));
    }

}
