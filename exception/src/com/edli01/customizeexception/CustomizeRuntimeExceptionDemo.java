package com.edli01.customizeexception;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.customizeexception
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-29 23:39
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class CustomizeRuntimeExceptionDemo {
    private static int depositAmount = 100;

    public static void main(String[] args) {
        try {
            withdrawDeposit(120);
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("自定義runtime異常發生：" + e.getMessage());
        }
    }

    public static void withdrawDeposit(int money) {
        System.out.println("****************withdrawDeposit方始執行開始****************");
        if(money > depositAmount) {
            throw new CustomizeRuntimeException("要領取金額大於存款金額");
        }else {
            System.out.println("領取成功");
            System.out.println("領取金額為：" + money);
            System.out.println("餘額為：" + depositAmount);
            System.out.println("歡迎下次再來。");
        }
        System.out.println("****************withdrawDeposit方始執行結束****************");
    }
}
