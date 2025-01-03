package com.edli01.multithread;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-02 14:07
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class MultithreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MultithreadDemo01();
        MultithreadDemo02();
    }

    private static void MultithreadDemo01() throws InterruptedException {
        System.out.println("****************Thread開始****************");
        //1. 繼承Thread類別
        QThread thread = new QThread();
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main(測試範例：Thread)->" + Thread.currentThread().getName() + ": " + i);
        }
        //2. 等待thread結束
        System.out.println("等待thread結束(測試範例：Thread)...");
        thread.join();


        System.out.println("****************Thread結束****************");
    }

    private static void MultithreadDemo02() throws InterruptedException {
        System.out.println("****************Runnable開始****************");
        //1. 實作Runnable介面
        QRunnable runnable = new QRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main(測試範例：Runnable)->" + Thread.currentThread().getName() + ": " + i);
        }

        //2. 等待Thread結束
        System.out.println("等待thread結束(測試範例：Runnable)...");
        thread.join();

        System.out.println("****************Runnable結束****************");
    }
}
