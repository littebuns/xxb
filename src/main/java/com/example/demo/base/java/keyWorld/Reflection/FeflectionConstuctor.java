package com.example.demo.base.java.keyWorld.Reflection;

import java.lang.reflect.Constructor;

/**
 * 通过反射访问构造方法
 */
public class FeflectionConstuctor {

    public static void main(String[] args) {
        //获取class对象
        Class<ExampleEntity> entityClass = ExampleEntity.class;
        //获取权限为public的所有构造方法
//        Constructor<?>[] constructors = entityClass.getConstructors();
//        for (Constructor constructor : constructors){
//            System.out.println(constructor);
//        }
        //获取所有的构造方法
        Constructor<?>[] constructors = entityClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            try {
                //设置为允许访问
                constructor.setAccessible(true);
                constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(constructor);
        }

    }
}
