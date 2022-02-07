package pers.xxb.keyword.annotation;

import org.junit.Test;
import pers.xxb.keyword.annotation.anno.MyAnnotation;

import java.util.ArrayList;

/**
 * 一些元注解的使用
 */
public class MetaData {


    @SuppressWarnings(value = {"unchecked","rawtypes"})
    @Test
    public void SuppressWarnings(){
        //使用了没有泛型限制的集合  编译器会警告
        ArrayList<String> list = new ArrayList();

    }

    @MyAnnotation(name = "hxt")
    @Test
    public void MyAnnotation(){

    }


}
