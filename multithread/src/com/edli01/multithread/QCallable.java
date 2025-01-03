package com.edli01.multithread;

import java.util.concurrent.Callable;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-03 11:48
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class QCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("Callable->" + Thread.currentThread().getName() + ": " + i);
        }
        return "Callable->" + Thread.currentThread().getName() + ": " + "Done";
    }
}
