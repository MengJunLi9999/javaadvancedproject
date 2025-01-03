package main.java.com.edli01.collection;

import java.util.*;
import java.util.function.Consumer;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.collection
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-31 10:29
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class CollectionForeachDemo {
    public static void main(String[] args) {
        collectionExample01();
    }

    private static void collectionExample01() {
        System.out.println("****************集合01開始****************");
        //1. 增強for循環
        Collection<String> collection = new ArrayList<>();
        collection.add("龍珠");
        collection.add("紅孩兒");
        collection.add("白骨精");
        collection.add("二郎神");
        collection.add("悟空");

        System.out.println("以For方式顯示：");
        for (String s : collection) {
            System.out.println(s);
        }

        System.out.println("****************我是分隔線****************");

        //2. forEach循環
        System.out.println("以Foreach方式顯示：");
        collection.forEach(new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        });
        System.out.println("****************集合01結束****************");
    }
}
