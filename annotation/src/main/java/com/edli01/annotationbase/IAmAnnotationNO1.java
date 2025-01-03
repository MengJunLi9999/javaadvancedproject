package main.java.com.edli01.annotationbase;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.annotationbase
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-01 21:36
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IAmAnnotationNO1 {
    String name() default "AnnotationNO1";
    int age() default 18;
    String[] skills();
}
