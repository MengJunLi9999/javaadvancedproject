package com.edli01.genericclassandinterface;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.genericclassandinterface
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-30 17:11
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public interface GenericInterface<E> {
    public void add(E entity);
    public void delete(int id);
    public void update(Hacker oldEntity, Hacker newEntity);
    public E query(int id);
    public String toString();
}
