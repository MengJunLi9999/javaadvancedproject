package main.java.com.edli01.genericpackage;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.genericpackage
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-30 20:57
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class GenericPackageDemo {
    public static void main(String[] args) {
        genericExample();
    }

    private static void genericExample() {
        List<Integer> intList = new ArrayList<>();  //泛型、封裝類型
        int intSum = 0;
        intList.add(100);   //自動裝箱
        intList.add(200);   //自動裝箱

        for(int intValue : intList) {   //自動拆箱
            intSum += intValue;
        }

        System.out.println("Sum of intList:" + String.valueOf(intSum));
    }
}
