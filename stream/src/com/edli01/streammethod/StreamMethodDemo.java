package com.edli01.streammethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.streammethod
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-31 16:32
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class StreamMethodDemo {
    public static void main(String[] args) {
        streamMethodExample01();
    }

    private static void streamMethodExample01() {
        System.out.println("****************ＳtreamMethod01開始****************");
        //1. 單列集合
        Collection<String> collection01 = new ArrayList<>();
        collection01.add("龍珠");
        collection01.add("紅孩兒");
        collection01.add("紅孩兒他娘");
        collection01.add("紅孩兒他爹");
        collection01.add("齊天大聖");
        collection01.add("天蓬元帥");
        collection01.add("唐三藏");

        // Stream精簡過濾寫法
        System.out.println("單列集合Stream過濾寫法：");
        collection01.stream().filter(str -> str.length() == 5 & str.startsWith("紅")).forEach(System.out::println);

        System.out.println("****************我是分隔線****************");

        //2. Stream的sorted
        Collection<Integer> collection02 = new ArrayList<>();
        collection02.add(100);
        collection02.add(58);
        collection02.add(85);
        collection02.add(79);
        collection02.add(66);
        collection02.add(95);
        collection02.add(90);
        collection02.add(100);

        //a.  遞增排序
        System.out.println("單列集合Stream過濾寫法-遞增排序：");
        collection02.stream().filter(d1 -> d1 >= 90 || d1 < 60).sorted((d1, d2) -> Integer.compare(d1, d2)).forEach(System.out::println);

        System.out.println("****************我是分隔線****************");

        //b. 遞減排序
        System.out.println("單列集合Stream過濾寫法-遞減排序：");
        collection02.stream().filter(d1 -> d1 >= 90 || d1 < 60).sorted((d1, d2) -> Integer.compare(d2, d1)).forEach(System.out::println);

        System.out.println("****************我是分隔線****************");

        //c. 遞減排序，去除重複
        collection02.stream().filter(d1 -> d1 >= 90 || d1 < 60).distinct().sorted((d1, d2) -> Integer.compare(d2, d1)).forEach(System.out::println);

        System.out.println("****************我是分隔線****************");

        //d. 遞減排序，忽略1名
        System.out.println("單列集合Stream過濾寫法-遞減排序，忽略4名：");
        collection02.stream().filter(d1 -> d1 >= 90 || d1 < 60).sorted((d1, d2) -> Integer.compare(d2, d1)).skip(4).forEach(System.out::println);

        //e. 映射方法，將原資料取出，再將新資料加入；開根號x10
        System.out.println("單列集合Stream過濾寫法-映射方法，將原資料取出，再將新資料加入：");
        collection02.stream().map(d -> "開根號x10：" + Math.sqrt(d) * 10).forEach(System.out::println);

        System.out.println("****************我是分隔線****************");

        //f. 合併方法，將兩個Stream合併
        Stream<Object> collection03 = Stream.concat(collection01.stream(), collection02.stream());
        System.out.println("單列集合Stream過濾寫法-合併方法，將兩個Stream合併：");
        System.out.println("總筆數：" + collection03.count());
//        collection03.sorted().forEach(System.out::println); // 報錯

        System.out.println("****************ＳtreamMethod01結束****************");
    }
}
