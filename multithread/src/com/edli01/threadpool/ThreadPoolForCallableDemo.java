package com.edli01.threadpool;

import com.edli01.multithread.QCallable;

import java.util.concurrent.*;

/**
*@Project: javaadvancedproject
*@Package: com.edli01
*@Author: MENG-JUN LI
*@CreateTime: 2025-01-03 12:40 
*@Instagram: https://www.instagram.com/edli_01
*@Blog: https://edli-01.com/
*@Description: 
**/
public class ThreadPoolForCallableDemo {
    public static void main(String[] args) throws Exception {
        final int MAX_POOL_SIZE_AND_QUEUE_CAPACITY = 8;
        final int OVER_MAX_POOL_SIZE_AND_QUEUE_CAPACITY = 10;

        threadPoolExample01(MAX_POOL_SIZE_AND_QUEUE_CAPACITY);
        threadPoolExample01(OVER_MAX_POOL_SIZE_AND_QUEUE_CAPACITY); // 會丟出異常
    }

    private static void threadPoolExample01(int count) throws Exception {
        System.out.println("****************Thread Pool開始(Callable)(tasksIsWithinTheRange = " + count + ")****************");

        //1. 創建ThreadPoolExecutor
        final int MAX_POOL_SIZE = 5;
        final int CORE_POOL_SIZE = 3;
        final int QUEUE_CAPACITY = 3;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, 500,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());


        //2. 使用Thread Pool處理任務，模擬任務多個任務處理，並且使用Thread Pool處理任務，傳遞True表示使用符合(max pool+queue)的任務，傳遞False表示使用超過(core pool+queue)任務
        Callable callable = new QCallable();

        //3. 任務數量符合(max pool+queue)
        //4. 任務數量超過(core pool+queue)
        for(int i = 0; i < count; i++) {
            Future future = threadPoolExecutor.submit(callable);
            System.out.println("Callable回傳結果->" + future.get());
        }

        //5. 結束Thread Pool
        terminatedThreadPool(threadPoolExecutor);

        System.out.println("****************Thread Pool結束(Callable)(tasksIsWithinTheRange = " + count + ")****************");
    }

    private static void terminatedThreadPool(ThreadPoolExecutor threadPoolExecutor) throws InterruptedException {
        //1. 關閉Thread Pool
        threadPoolExecutor.shutdown();

        //2. 確認Thread Pool是否已關閉
        System.out.println("Thread Pool是否已關閉：" + threadPoolExecutor.isShutdown());

        //3. 等待Thread Pool結束，沒結束前，主線程等待
        System.out.println("等待Thread Pool結束...");
        threadPoolExecutor.awaitTermination(3, TimeUnit.SECONDS);

        //4. 確認Thread Pool是否已終止
        System.out.println("Thread Pool是否已終止：" + threadPoolExecutor.isTerminated());
    }
}
