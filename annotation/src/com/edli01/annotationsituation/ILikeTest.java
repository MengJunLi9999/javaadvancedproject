package com.edli01.annotationsituation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.annotationsituation
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-01 22:27
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ILikeTest {
}
