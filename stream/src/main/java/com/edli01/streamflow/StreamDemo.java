package main.java.com.edli01.streamflow;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.streamflow
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-31 14:30
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class StreamDemo {
    public static void main(String[] args) {
        streamExample01();
    }

    private static void streamExample01() {
        System.out.println("****************Ｓtream01開始****************");
        //1. 單列集合
        Collection<String> collection = new ArrayList<>();
        collection.add("龍珠");
        collection.add("紅孩兒");
        collection.add("白骨精");
        collection.add("齊天大聖");
        collection.add("天蓬元帥");
        collection.add("唐三藏");

        Stream<String> stream = collection.stream();
        // 透過stream顯示單列集合內容
        System.out.println("透過stream顯示單列集合內容：");
        stream.forEach(System.out::println);

        System.out.println("****************我是分隔線****************");

        //2. 雙列集合
        Map<String, String> map = new HashMap<>();
        map.put("1", "龍珠");
        map.put("2", "紅孩兒");
        map.put("3", "白骨精");
        map.put("4", "齊天大聖");
        map.put("5", "天蓬元帥");
        map.put("6", "唐三藏");
        Stream<String> keyStream = map.keySet().stream();
        Stream<String> valueStream = map.values().stream();
        Stream<Map.Entry<String, String>> entryStream = map.entrySet().stream();

        // 透過stream顯示雙列集合內容
        System.out.println("透過stream顯示雙列集合內容：");
        keyStream.forEach(System.out::println);
        valueStream.forEach(System.out::println);

        System.out.println("****************我是分隔線****************");

        //3. 陣列
        String[] strArray = {"龍珠", "紅孩兒", "白骨精", "齊天大聖", "天蓬元帥", "唐三藏"};
        Stream<String> arrayStream01 = Arrays.stream(strArray);
        // 透過stream顯示陣列內容
        System.out.println("透過stream01顯示陣列內容：");
        arrayStream01.forEach(System.out::println);

        System.out.println("****************我是分隔線****************");

        // 以stream.of()為範例
        Stream<String> arrayStream02 = Stream.of(strArray);
        System.out.println("透過stream02顯示陣列內容：");
        arrayStream02.forEach(System.out::println);

        System.out.println("****************我是分隔線****************");

        Stream<String> arrayStream03 = Stream.of("龍珠", "紅孩兒", "白骨精", "齊天大聖", "天蓬元帥", "唐三藏");
        System.out.println("透過stream03顯示陣列內容：");
        arrayStream03.forEach(System.out::println);

        System.out.println("****************Ｓtream01結束****************");
    }
}
