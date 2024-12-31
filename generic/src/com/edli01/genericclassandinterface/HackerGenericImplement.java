package com.edli01.genericclassandinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.genericclassandinterface
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-30 17:54
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class HackerGenericImplement implements GenericInterface<Hacker> {
    private List<Hacker> hackerList = new ArrayList<>();

    @Override
    public void add(Hacker entity) {
        hackerList.add(entity);
    }

    @Override
    public void delete(int id) {
        hackerList.remove(hackerList.get(--id));
    }

    @Override
    public void update(Hacker oldEntity, Hacker newEntity) {
        hackerList.remove(oldEntity);
        hackerList.add(newEntity);
    }

    @Override
    public Hacker query(int id) {
        for(Hacker entity : hackerList) {
            if (entity.getId() == id) {
                return entity;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "HackerGenericImplement{" +
                "hackerList=" + hackerList +
                '}';
    }
}
