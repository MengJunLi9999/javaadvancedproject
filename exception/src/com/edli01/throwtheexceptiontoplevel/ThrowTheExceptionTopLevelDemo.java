package com.edli01.throwtheexceptiontoplevel;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.throwtheexceptiontoplevel
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-30 14:40
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class ThrowTheExceptionTopLevelDemo {
    // 將異常丟到最上層後，以try、catch處理。
    public static void main(String[] args) {
        try {
            exceptionExample01();   // ParseException
            exceptionExample02();   // FileNotFoundException、IOException
        } catch (Exception e) {
            System.out.println("例外處理發生異常：" + e.getMessage());
        }
    }

    private static void exceptionExample01() throws Exception {
        System.out.println("****************例外處理範例01開始****************");
        // ParseException 範例 (String 轉 Date 格式失敗)
        String dateStr = "2024-12-29 21:36:05"; // 正確格式應為 "yyyy-MM-dd"
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = formatter.parse(dateStr);
        System.out.println("轉換後的日期: " + date);
        System.out.println("****************例外處理範例01結束****************");
    }

    private static void exceptionExample02() throws Exception {
        System.out.println("****************例外處理範例02開始****************");
        // 讀取檔案範例程式碼，可於不同作業系統讀取特定路徑及名稱檔案
        // 若檔案不存在，則會拋出 FileNotFoundException 異常；若檔案存在，但無法讀取，則會拋出 IOException 異常。
        Path filePath = Paths.get("exceptionExample02.txt");
        BufferedReader reader = Files.newBufferedReader(filePath);
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

        System.out.println("****************例外處理範例02結束****************");
    }
}
