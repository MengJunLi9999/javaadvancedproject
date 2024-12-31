package com.edli01.generic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.generic
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-30 15:31
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class GenericDemo {
    public static void main(String[] args) {
        genericDemo01();
    }

    private static void genericDemo01() {
        System.out.println("****************泛型範例01開始****************");
        List<String> genericList = new ArrayList<>();
        genericList.add("Tom");
        genericList.add("Cat");
        genericList.add("King");

        for(String entity : genericList) {
            System.out.println(entity);
        }

        System.out.println("****************泛型範例01結束****************");
    }
}
