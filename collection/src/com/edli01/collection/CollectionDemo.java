package com.edli01.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.collection
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-31 09:45
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class CollectionDemo {
    public static void main(String[] args) {
        collectionDemo01();
    }

    private static void collectionDemo01() {
        // 1. 创建集合对象
        Collection<String> collection = new ArrayList();    // 泛型
        // 2. 添加元素
        collection.add("虛竹");
        collection.add("掃地僧");
        collection.add("周星星");
        collection.add("令狐沖");
        collection.add("楊過");
        System.out.println("列印筆數：" + collection.size());
        System.out.println("列印內容：" + collection);
        System.out.println("列印第1筆資料：" + collection.iterator().next());

        System.out.println("****************我是分隔線****************");

        // 3. 增加重複資料
        collection.add("周星星");
        System.out.println("添加1筆重複資料：");
        System.out.println("列印筆數：" + collection.size());
        System.out.println("列印內容：" + collection);

        System.out.println("****************我是分隔線****************");

        // 4. 刪除重複資料
        collection.remove("周星星");
        System.out.println("刪除1筆重複資料：");
        System.out.println("列印筆數：" + collection.size());
        System.out.println("列印內容：" + collection);

        System.out.println("****************我是分隔線****************");

        // 5. 刪除所有資料
        collection.clear();
        System.out.println("已刪除所有資料");

        System.out.println("****************我是分隔線****************");

        // 6. 判斷是否為空
        System.out.println("判斷是否為空：" + collection.isEmpty());
        System.out.println("列印筆數：" + collection.size());
    }
}
