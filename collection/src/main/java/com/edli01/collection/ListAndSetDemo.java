package main.java.com.edli01.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.collection
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-31 09:26
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class ListAndSetDemo {
    public static void main(String[] args) {
        collectionExample01();
    }

    private static void collectionExample01() {
        System.out.println("****************集合01開始****************");
        //1. List特性範例：有序、可重複、有index
        List<String> list = new ArrayList<>();
        list.add("龍珠");
        list.add("紅孩兒");
        list.add("白骨精");
        list.add("二郎神");
        list.add("悟空");
        list.add("紅孩兒");    // 可重複
        System.out.println("列印List筆數：" + list.size());
        System.out.println("列印List內容：" + list);
        System.out.println("列印List第1筆資料：" + list.get(0));

        System.out.println("****************我是分隔線****************");

        //2. Set特性範例：無序、不可重複、無index
        Set<String> set = new HashSet<>();
        set.add("龍珠");
        set.add("紅孩兒");
        set.add("白骨精");
        set.add("二郎神");
        set.add("悟空");
        set.add("紅孩兒"); // 不可重複
        System.out.println("列印Set筆數：" + set.size());
        System.out.println("列印Set內容：" + set);
        System.out.println("列印Set第1筆資料：" + set.iterator().next());
        System.out.println("****************集合01結束****************");
    }
}
