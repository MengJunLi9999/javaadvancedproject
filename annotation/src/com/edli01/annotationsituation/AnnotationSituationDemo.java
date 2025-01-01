package com.edli01.annotationsituation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.annotationsituation
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-01 22:25
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class AnnotationSituationDemo {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        annotationSituationExample01();
    }

    private static void annotationSituationExample01() throws InvocationTargetException, IllegalAccessException {
        //1. 取得類的註解的資訊
        ILikeTest annotationClass = AnnotationSituationDemo.class.getAnnotation(ILikeTest.class);
        //2. 取得方法的註解的資訊
        ILikeTest annotationMethod = AnnotationSituationDemo.class.getMethods()[0].getAnnotation(ILikeTest.class);
        //3. 遍歷類的方法
        for(Method method : AnnotationSituationDemo.class.getMethods()) {
            //4. 取得方法的註解的資訊
            ILikeTest annotationMethod2 = method.getAnnotation(ILikeTest.class);
            //5. 判斷方法有註解，如果有註解，則執行方法
            if (method.isAnnotationPresent(ILikeTest.class)) {
                method.invoke(new AnnotationSituationDemo());
            }
        }
    }

    @ILikeTest
    public void likeTest01() {
        System.out.println("likeTest01已經成功執行!!");
    }

    @ILikeTest
    public void likeTest02() {
        System.out.println("likeTest02已經成功執行!!!");
    }

    public void likeTest03() {
        System.out.println("likeTest03已經成功執行!!!");
    }

    @ILikeTest
    public void likeTest04() {
        System.out.println("likeTest04已經成功執行!!!");
    }
}
