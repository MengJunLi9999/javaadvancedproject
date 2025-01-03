package main.java.com.edli01.genericclassandinterface;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.genericclassandinterface
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-30 15:45
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class GenericClassDemo {
    public static void main(String[] args) {
        gernicExample01();
    }

    private static void gernicExample01() {
        // 自定義泛型類別
        // 調用add方法
        GenericClass<String> genericClass = new GenericClass<>();
        genericClass.add("戰鬥勝佛");
        genericClass.add("孫悟空");
        genericClass.add("唐三藏");
        genericClass.add("沙悟淨");
        genericClass.add("豬八戒");
        System.out.println("泛型類別：" + genericClass.toString());

        // 調用remove方法
        String removeEntity = "沙悟淨";
        System.out.println("調用remove方法：刪除" + removeEntity);
        genericClass.remove(removeEntity);
        System.out.println("泛型類別：" + genericClass.toString());
    }
}
