package main.java.com.edli01.streamfinalmethod;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.streamfinalmethod
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-31 17:33
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class StreamFinalMethodDemo {
    public static void main(String[] args) {
        streamFinalMethodExample01();
    }

    private static void streamFinalMethodExample01() {
        System.out.println("****************ＳtreamFinalMethod01開始****************");
        //1. Stream遍歷
        Collection<ＷhiteHat> collection = new ArrayList<>();
        collection.add(new ＷhiteHat("包龍星", CodingSkillLevel.EXPERT, 100000));
        collection.add(new ＷhiteHat("何金銀", CodingSkillLevel.ADVANCED, 90000));
        collection.add(new ＷhiteHat("至尊寶", CodingSkillLevel.ADVANCED, 85000));
        collection.add(new ＷhiteHat("韋小寶", CodingSkillLevel.BEGINNER, 50000));
        collection.add(new ＷhiteHat("蘇察哈爾燦", CodingSkillLevel.INTERMEDIATE, 70000));
        collection.add(new ＷhiteHat("唐伯虎", CodingSkillLevel.EXPERT, 100500));

        // 原始資料遍歷
        System.out.println("原始資料遍歷：");
        collection.stream().forEach(System.out::println);

        System.out.println("****************我是分隔線****************");

        // 取得技能等級超過ADVANCED的白帽子
        System.out.println("獲取技能等級超過ADVANCED的白帽子：");
        collection.stream().filter(wh -> wh.codingSkillLevel == CodingSkillLevel.ADVANCED || wh.getCodingSkillLevel() == CodingSkillLevel.EXPERT).forEach(System.out::println);

        System.out.println("****************我是分隔線****************");

        //2. 取得最高薪水的角色資訊
        System.out.println("獲取最高薪水的角色資訊：");
        collection.stream().max((o1, o2) -> o1.getSalary() - o2.getSalary()).ifPresent(System.out::println);
        System.out.println("****************我是分隔線****************");

        //3. 取得最低薪水的角色資訊
        System.out.println("獲取最低薪水的角色資訊：");
        collection.stream().min((o1, o2) -> o1.getSalary() - o2.getSalary()).ifPresent(System.out::println);

        System.out.println("****************我是分隔線****************");

        //4. 收集流到集合中
        System.out.println("收集流到集合中：");
        Stream<ＷhiteHat> stream01 = collection.stream().filter(wh -> wh.getCodingSkillLevel() == CodingSkillLevel.EXPERT);
        // 存到List中
        List<ＷhiteHat> list = stream01.collect(Collectors.toList());
        // 列印
        list.forEach(System.out::println);

        System.out.println("****************我是分隔線****************");

        //5. 收集到收集到陣列
        System.out.println("收集到收集到陣列：");
        Stream<ＷhiteHat> stream02 = collection.stream().filter(wh -> wh.getCodingSkillLevel() == CodingSkillLevel.EXPERT);
        // 存到陣列中
        Object[] array = stream02.toArray();
        // 列印
        System.out.println(Arrays.toString(array));

        //6. 收集Map01，顯示特定資訊
        System.out.println("收集Map01，顯示特定資訊：");
        Map<String, Integer> map01 = collection.stream().collect(Collectors.toMap(ＷhiteHat::getName, ＷhiteHat::getSalary));
        System.out.println(map01);

        System.out.println("****************我是分隔線****************");

        //7. 收集Map02，顯示特定資訊
        System.out.println("收集Map02，顯示特定資訊：");
        Map<String, Integer> map02 = collection.stream().collect(Collectors.toMap(new Function<ＷhiteHat, String>() {
            @Override
            public String apply(ＷhiteHat whiteHat) {
                return whiteHat.getName();
            }
        }, new Function<ＷhiteHat, Integer>() {
            @Override
            public Integer apply(ＷhiteHat whiteHat) {
                return whiteHat.getSalary();
            }
        }));
        System.out.println(map02);

        System.out.println("****************ＳtreamFinalMethod01結束****************");
    }
}
