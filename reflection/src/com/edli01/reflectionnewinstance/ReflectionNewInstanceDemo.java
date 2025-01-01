package com.edli01.reflectionnewinstance;

import com.edli01.reflectioncombination.GrayHat;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-01 14:30
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class ReflectionNewInstanceDemo {
    public static void main(String[] args) throws Exception {
        reflectionNewInstanceExample01();
    }

    private static void reflectionNewInstanceExample01() throws Exception {
        System.out.println("****************ReflectionNewInstance開始****************");
        Class clazz = GrayHat.class;

        //1. 反射建構子無參數，私有修飾符
        Constructor constructorArg0 = clazz.getDeclaredConstructor();
        constructorArg0.setAccessible(true);
        GrayHat grayHat01 = (GrayHat) constructorArg0.newInstance();

        //2. 反射建構子有參數，私有修飾符
        Constructor constructorArg2 = clazz.getDeclaredConstructor(String.class, int.class);
        constructorArg2.setAccessible(true);
        GrayHat grayHat02 = (GrayHat) constructorArg2.newInstance("edli01", 40);

        //3. 反射成員變量，取值跟設值
        Field fieldName = clazz.getDeclaredField("name");
        Field fieldAge = clazz.getDeclaredField("age");
        fieldName.setAccessible(true);
        fieldName.set(grayHat02, "MENG JUN LI");
        fieldAge.setAccessible(true);
        fieldAge.set(grayHat02, 100);

        System.out.println("反射成員變量資訊：");
        System.out.println("名稱成員變量：");
        System.out.println("  變量名稱：" + fieldName.getName());
        System.out.println("  變量類型：" + fieldName.getType().getSimpleName());
        System.out.println("  變量值：" + fieldName.get(grayHat02));
        System.out.println("  修飾符：" + java.lang.reflect.Modifier.toString(fieldName.getModifiers()));

        System.out.println("年齡成員變量：");
        System.out.println("  變量名稱：" + fieldAge.getName());
        System.out.println("  變量類型：" + fieldAge.getType().getSimpleName());
        System.out.println("  變量值：" + fieldAge.get(grayHat02));
        System.out.println("  修飾符：" + java.lang.reflect.Modifier.toString(fieldAge.getModifiers()));
//        System.out.println("成員->" + fieldName.getName() + "：型態->[" + fieldName.getType().getName() + "]" + "：取值->[" + fieldName.get(grayHat02) + "]");

        System.out.println("****************我是分隔線****************");

        //4. 反射方法
        Method methodSpeak = clazz.getDeclaredMethod("speak", String.class);
        Object methodSpeakReturnResult = methodSpeak.invoke(grayHat02, "滲透測試技巧");
        // 列印反射方法資訊
        System.out.println("反射方法資訊：");
        System.out.println("方法名稱：" + methodSpeak.getName());
        System.out.println("返回值類型：" + methodSpeak.getReturnType().getSimpleName());
        System.out.println("參數類型：" + methodSpeak.getParameterTypes()[0].getSimpleName());
        System.out.println("方法修飾符：" + java.lang.reflect.Modifier.toString(methodSpeak.getModifiers()));
        System.out.println("方法調用結果：" + methodSpeakReturnResult);

        System.out.println("****************ReflectionNewInstance結束****************");
    }
}
