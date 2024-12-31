package com.edli01.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.collection
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-31 10:15
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class CollectionIteratorDemo {
    public static void main(String[] args) {
        collectionExample01();
    }

    private static void collectionExample01() {
        //1. 新增元素到Collection
        Collection<String> collection = new ArrayList<>();
        collection.add("地球");
        collection.add("火星");
        collection.add("太陽");
        collection.add("月亮");
        collection.add("星星");
        System.out.println("列印筆數：" + collection.size());
        System.out.println("列印內容：" + collection);

        System.out.println("****************我是分隔線****************");

        //2. 使用Iterator遍歷
        Iterator<String> it = collection.iterator();

        //3. 遍歷顯示Collection資訊
        System.out.println("開始遍歷：");
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
