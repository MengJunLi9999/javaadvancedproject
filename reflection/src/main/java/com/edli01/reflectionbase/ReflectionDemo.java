package main.java.com.edli01.reflectionbase;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-01 11:26
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        reflectionExample01();
    }

    private static void reflectionExample01() throws ClassNotFoundException {
        System.out.println("****************Reflection開始****************");

        //1. 使用：Class.forName("類")
        Class<?> class01 = null;

        class01 = Class.forName("main.java.com.edli01.reflectionbase.WhiteHat");
        // 列印第1個反射取得的類資訊
        System.out.println("列印第1個反射類資訊：");
        System.out.println(class01);


        System.out.println("****************我是分隔線****************");

        //2. 使用：類.class
        Class class02 = WhiteHat.class;
        // 列印第2個反射取得的類資訊
        System.out.println("列印第2個反射取得的類資訊：");
        System.out.println(class02);

        System.out.println("****************我是分隔線****************");

        //3. 使用：對象.getClass()
        WhiteHat whiteHat = new WhiteHat();
        Class class03 = whiteHat.getClass();
        // 列印第3個反射取得的類資訊
        System.out.println("列印第3個反射取得的類資訊：");
        System.out.println(class03);

        //4. 驗證3種反射方式是否皆指向相同Class
        System.out.println("驗證3種反射方式是否皆指向相同Class：");
        System.out.println("class01 == class02：" + (class01 == class02));
        System.out.println("class01 == class03：" + (class01 == class03));
        System.out.println("class02 == class03：" + (class02 == class03));

        System.out.println("****************Reflection結束****************");
    }
}
