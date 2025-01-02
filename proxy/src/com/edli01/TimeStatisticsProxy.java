package com.edli01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-02 10:23
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class TimeStatisticsProxy {
    public static<T> Object createProxy(T obj) {
        T proxy = (T) Proxy.newProxyInstance(TimeStatisticsProxy.class.getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long start = System.currentTimeMillis();

                Object result = method.invoke(obj, args);

                long end = System.currentTimeMillis();
                System.out.println(method.getName() + "->執行時間：" + (end - start) + "ms");

                return result;
            }
        });
        return (T) proxy;
    }
}
