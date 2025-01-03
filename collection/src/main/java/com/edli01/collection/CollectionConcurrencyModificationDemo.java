package main.java.com.edli01.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.list
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-31 11:43
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class CollectionConcurrencyModificationDemo {
    public static void main(String[] args) {
        listExample01();
    }

    private static void listExample01() {
        System.out.println("****************集合01開始****************");
        //1. 併發修改問題修訂
        ArrayList<String>  list01 = new ArrayList<>();
        list01.add("龍珠");
        list01.add("紅孩兒");
        list01.add("紅孩兒他媽");
        list01.add("紅孩兒他爸");
        list01.add("二郎神");
        list01.add("悟空");

        // 列印目前集合中資料
        System.out.println("列印目前list01集合中資料：" + list01.toString());

        System.out.println("****************我是分隔線****************");

        //2. 錯誤範例：同步查詢及刪除集合資料
//        ArrayList<String>  list02 = new ArrayList<>();
//        list02.add("龍珠");
//        list02.add("紅孩兒");
//        list02.add("紅孩兒他媽");
//        list02.add("紅孩兒他爸");
//        list02.add("二郎神");
//        list02.add("悟空");

//        for(int i = 0; i < list02.size(); i++) {
//            String str = list02.get(i);
//            if (str.contains("紅孩兒")) {
//                list02.remove(str);
//            }
//        }
//        // 列印目前集合中資料
//        System.out.println("列印目前list02集合中資料：" + list02.toString());

        //2. 錯誤範例修訂
        ArrayList<String>  list02 = new ArrayList<>();
        list02.add("龍珠");
        list02.add("紅孩兒");
        list02.add("紅孩兒他媽");
        list02.add("紅孩兒他爸");
        list02.add("二郎神");
        list02.add("悟空");

        for(int i = 0; i < list02.size(); i++) {
            String str = list02.get(i);
            if (str.contains("紅孩兒")) {
                list02.remove(str);
                --i;
            }
        }
        // 列印目前集合中資料
        System.out.println("列印目前list02集合中資料：" + list02.toString());

        System.out.println("****************我是分隔線****************");

        //3. 正確範例：使用Iterator的remove
        ArrayList<String>  list03 = new ArrayList<>();
        list03.add("龍珠");
        list03.add("紅孩兒");
        list03.add("紅孩兒他媽");
        list03.add("紅孩兒他爸");
        list03.add("二郎神");
        list03.add("悟空");

        Iterator<String> iterator = list03.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.contains("紅孩兒")) {
//                list03.remove(str);   // 錯誤
                iterator.remove();
            }
        }
        // 列印目前集合中資料
        System.out.println("列印目前list03集合中資料：" + list03.toString());

        System.out.println("****************我是分隔線****************");

        //4. 錯誤範例：使用Lambda
//        ArrayList<String>  list04 = new ArrayList<>();
//        list04.add("龍珠");
//        list04.add("紅孩兒");
//        list04.add("紅孩兒他媽");
//        list04.add("紅孩兒他爸");
//        list04.add("二郎神");
//        list04.add("悟空");
//
//        list04.forEach(str -> {
//            if(str.contains("紅孩兒")) {
//                list04.remove(str);
//            }
//        });
//        // 列印目前集合中資料
//        System.out.println("列印目前list04集合中資料：" + list04.toString());
//
//        System.out.println("****************我是分隔線****************");

        //5. 錯誤範例：for的remove
//        ArrayList<String>  list05 = new ArrayList<>();
//        list05.add("龍珠");
//        list05.add("紅孩兒");
//        list05.add("紅孩兒他媽");
//        list05.add("紅孩兒他爸");
//        list05.add("二郎神");
//        list05.add("悟空");
//
//        for(String str : list04) {
//            if(str.contains("紅孩兒")) {
//                list05.remove(str);
//            }
//        }
//        // 列印目前集合中資料
//        System.out.println("列印目前list05集合中資料：" + list05.toString());
//
//        System.out.println("****************集合01結束****************");
    }
}
