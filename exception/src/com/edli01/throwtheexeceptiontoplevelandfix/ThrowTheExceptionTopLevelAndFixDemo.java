package com.edli01.throwtheexeceptiontoplevelandfix;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.throwtheexeceptiontoplevelandfix
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-30 15:00
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class ThrowTheExceptionTopLevelAndFixDemo {
    public static void main(String[] args) {
        while(true) {
            try {
                double money = exceptionExample01();
                System.out.println("您輸入的金額為：" + money);
                System.out.println("提領成功。");
            } catch (Exception e) {
//                e.printStackTrace();
//                System.out.println("異常發生：" + e.getMessage());
                System.out.println("您輸入的數據提領金額有誤，請重新輸入。");
            }
        }
    }

    private static double exceptionExample01() {
        System.out.println("****************例外處理範例01開始****************");
        System.out.print("尊貴的客戶，請輸入要提領的金額：");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        System.out.println("****************例外處理範例01結束****************");
        return money;
    }
}
