package pers.xxb.keyword.annotation;

import org.junit.Test;
import pers.xxb.keyword.annotation.anno.MyAnnotation;

import java.lang.annotation.Annotation;

/**
 * 访问注解
 */
public class AccessAnnotation {

    /**
     * 遍历 方法上所有注解
     */
    @Test
    public void traverseAnnotation() throws NoSuchMethodException {
        Annotation[] annotations = MetaData.class.getMethod("MyAnnotation").getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
            if (annotation instanceof MyAnnotation){
                MyAnnotation myAnnotation = (MyAnnotation) annotation;
                System.out.println(myAnnotation.name());
                System.out.println(myAnnotation.age());
            }
        }

    }

}
