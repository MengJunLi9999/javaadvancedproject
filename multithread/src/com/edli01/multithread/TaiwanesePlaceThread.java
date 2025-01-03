package com.edli01.multithread;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-03 09:47
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class TaiwanesePlaceThread implements Runnable {
//    private static final String[] places = {"Taoyuan", "Kaohsiung", "Taipei", "Taitung", "Pingtung", "Taichung", "Tainan"};
    private static final String[] places = {"台北", "高雄", "雲林"};
    @Override
    public void run() {
        for (String place : places) {
            System.out.println(Thread.currentThread().getName() + ": " + place);
        }
    }
}
