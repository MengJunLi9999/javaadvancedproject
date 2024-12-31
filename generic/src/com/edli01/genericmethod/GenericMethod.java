package com.edli01.genericmethod;

import java.util.ArrayList;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.genericmethod
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-30 19:38
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class GenericMethod {
    public static void main(String[] args) {
        ArrayList<Tesla> teslas = new ArrayList<>();
        teslas.add(new Tesla());
        genericExample01(teslas);

        ArrayList<X> xs = new ArrayList<>();
        xs.add(new X());
        genericExample01(xs);
    }

    private static void genericExample01(ArrayList<? extends Car> cars) {
        for (Car car : cars) {
            car.display();
        }
    }
}
