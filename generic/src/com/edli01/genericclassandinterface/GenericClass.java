package com.edli01.genericclassandinterface;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.genericclassandinterface
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-30 16:06
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class GenericClass<E> {
    //借花獻佛
    private List theJourneyToTheWestList = new ArrayList<>();

    public boolean add(E entity) {
        theJourneyToTheWestList.add(entity);
        return true;
    }

    public boolean remove(E entity) {
        theJourneyToTheWestList.remove(entity);
        return true;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "theJourneyToTheWestList=" + theJourneyToTheWestList.toString() +
                '}';
    }
}
