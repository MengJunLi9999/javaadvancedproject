package main.java.com.edli01.annotationbase;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.annotationbase
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-01 22:02
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class AnnotationDemo {
    public static void main(String[] args) throws NoSuchMethodException {
        annotationExample01();
    }

    private static void annotationExample01() throws NoSuchMethodException {
        System.out.println("****************註解01開始****************");
        //1. 取得類的註解的資訊
        IAmAnnotationNO1 annotationClass = INeedAnnotation.class.getAnnotation(IAmAnnotationNO1.class);

        System.out.println("姓名：" + annotationClass.name());
        System.out.println("年齡：" + annotationClass.age());
        for(int i = 0; annotationClass.skills().length > i; i++) {
            System.out.println("技能[" + i + "]：" + annotationClass.skills()[i]);
        }

        System.out.println("****************我是分隔線****************");

        //2. 取得方法的註解的資訊
        IAmAnnotationNO1 annotationMethod = INeedAnnotation.class.getMethod("shareInformation").getAnnotation(IAmAnnotationNO1.class);

        System.out.println("姓名：" + annotationMethod.name());
        System.out.println("年齡：" + annotationMethod.age());
        for(int i = 0; annotationMethod.skills().length > i; i++) {
            System.out.println("技能[" + i + "]：" + annotationMethod.skills()[i]);
        }

        System.out.println("****************註解01結束****************");
    }
}
