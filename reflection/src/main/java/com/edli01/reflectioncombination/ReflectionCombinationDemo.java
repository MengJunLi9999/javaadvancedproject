package main.java.com.edli01.reflectioncombination;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-01 12:13
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class ReflectionCombinationDemo {
    public static void main(String[] args) throws Exception {
        reflectionCombinationExample01();
    }

    private static void reflectionCombinationExample01() throws Exception {
        System.out.println("****************ReflectionCombination開始****************");
        //1. 取得類。
        Class clazz = GrayHat.class;

        //2. 取得類的所有成員。
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            System.out.println("成員->" + field.getName() + "：[" + field.getType().getName() + "]");
        }
        // 取得成員，名稱為name。
        Field fieldName = clazz.getDeclaredField("name");
        System.out.println("成員->" + fieldName.getName() + "：[" + fieldName.getType().getName() + "]");
        // 取得成員，名稱為age。
        Field fieldAge = clazz.getDeclaredField("age");
        System.out.println("成員->" + fieldAge.getName() + "：[" + fieldAge.getType().getName() + "]");

        System.out.println("****************我是分隔線****************");

        //3. 取得類的所有方法。
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods) {
            System.out.println("方法->" + method.getName() + "：回傳值->[" + method.getReturnType().getName() + "]" + ":參數->[" + method.getParameterCount() + "]");
        }

        System.out.println("****************我是分隔線****************");

        // 取得方法，名稱為getName。
        Method methodGetName = clazz.getDeclaredMethod("getName");
//        System.out.println("方法->" + methodGetName.getName() + "：回傳值->[" + methodGetName.getReturnType().getName() + "]" + ":參數->[" + methodGetName.getParameterCount() + "]");
        // 取得方法，名稱為setName。
        Method methodSetName = clazz.getDeclaredMethod("setName", String.class);
//        System.out.println("方法->" + methodSetName.getName() + "：回傳值->[" + methodSetName.getReturnType().getName() + "]" + ":參數->[" + methodSetName.getParameterCount() + "]");
        // 取得方法，名稱為getAge。
        Method methodGetAge = clazz.getDeclaredMethod("getAge");
//        System.out.println("方法->" + methodGetAge.getName() + "：回傳值->[" + methodGetAge.getReturnType().getName() + "]" + ":參數->[" + methodGetAge.getParameterCount() + "]");
        // 取得方法，名稱為setAge。
        Method methodSetAge = clazz.getDeclaredMethod("setAge", int.class);
//        System.out.println("方法->" + methodSetAge.getName() + "：回傳值->[" + methodSetAge.getReturnType().getName() + "]" + ":參數->[" + methodSetAge.getParameterCount() + "]");

//        System.out.println("****************我是分隔線****************");

        //4. 取得類的所有建構子。
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for(Constructor constructor : constructors) {
            System.out.println("建構子->" + constructor.getName() + "：[" + constructor.getParameterCount() + "]");
        }
        // 取得建構子，參數0至2。
        Constructor constructorArg0 = clazz.getDeclaredConstructor();
        Constructor constructorArg1 = clazz.getDeclaredConstructor(String.class);
        Constructor constructorArg2 = clazz.getDeclaredConstructor(String.class, int.class);

        System.out.println("****************ReflectionCombination結束****************");
    }
}
