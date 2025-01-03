package main.java.com.edli01.compilationandruntimeexception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.compilationexception
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-29 20:33
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class CompilationAndRuntimeExceptionDemo {
    public static void main(String[] args) {
        exceptionExample01();
        exceptionExample02();
        exceptionExample03(5, 5);
        exceptionExample03(5, 0);
    }
    private static void exceptionExample01() {
        System.out.println("****************例外處理範例01開始****************");

        // 1. ArithmeticException 範例
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 發生: " + e.getMessage());
        }

        // 2. NullPointerException 範例
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 發生: " + e.getMessage());
        }

        // 3. ArrayIndexOutOfBoundsException 範例
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException 發生: " + e.getMessage());
        }

        // 4. ClassCastException 範例
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException 發生: " + e.getMessage());
        }

        System.out.println("****************例外處理範例01結束****************");
    }

    private static void exceptionExample02() {
        System.out.println("****************例外處理範例02開始****************");

        // ParseException 範例 (String 轉 Date 格式失敗)
        try {
            String dateStr = "2024-12-29 21 36 05"; // 正確格式應為 "yyyy-MM-dd"
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = formatter.parse(dateStr);
            System.out.println("轉換後的日期: " + date);
        } catch (ParseException e) {
            System.out.println("ParseException 發生: " + e.getMessage());
        }

        System.out.println("****************例外處理範例02結束****************");
    }

    private static void exceptionExample03(int num01, int num02) {
        System.out.println("****************例外處理範例03開始****************");
        try {
            System.out.println(div(num01, num02));
            System.out.println("exceptionExample03方法的除法運算成功。");
        } catch (ArithmeticException e) {
            e.printStackTrace();    // 其它多執行緒處理打印
            System.out.println("ArithmeticException 發生: " + e.getMessage());
        }
        System.out.println("****************例外處理範例03結束****************");
    }

    private static int div(int num1, int num2) throws ArithmeticException {
        if(num2 == 0) {
            throw new ArithmeticException("除數不能為 0");
            //throw new Exception("除數不能為 0");
        }
        int result = num1 / num2;
        return result;
    }
}
