package com.edli01.reflectionnewinstance;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-01 15:37
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class ReflectionFrameworkDemo {
    public static void main(String[] args) throws Exception {
        reflectionFrameworkExample01();
    }

    private static void reflectionFrameworkExample01() throws ClassNotFoundException {
        //1. 繞過泛型約束
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add("Go");

    }
}
