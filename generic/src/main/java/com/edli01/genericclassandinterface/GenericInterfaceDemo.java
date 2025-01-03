package main.java.com.edli01.genericclassandinterface;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.genericclassandinterface
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-30 17:15
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class GenericInterfaceDemo {
    public static void main(String[] args) {
        genericInterfaceExample01();
    }

    private static void genericInterfaceExample01() {
        // 增加4個Hacker資訊
        GenericInterface<Hacker> genericInterface = new HackerGenericImplement();
        genericInterface.add(new Hacker(1, "C", "China", CodingSkillLevel.EXPERT, "10111111"));
        genericInterface.add(new Hacker(2, "U", "US", CodingSkillLevel.EXPERT, "11111101"));
        genericInterface.add(new Hacker(3, "T", "TW", CodingSkillLevel.ADVANCED, "11111100"));
        genericInterface.add(new Hacker(4, "A", "Australia", CodingSkillLevel.ADVANCED, "11100111"));
        // 顯示全部資訊
        System.out.println(genericInterface.toString());

        // 刪除ID: 4的資訊
        genericInterface.delete(4);
        // 刪除1筆資料後，重新顯示全部資訊
        System.out.println(genericInterface.toString());

        // 查詢ID: 3的資訊
        System.out.println("查詢ID: 3的資訊為" + genericInterface.query(3).toString());
    }
}
