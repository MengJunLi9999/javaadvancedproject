package com.edli01;

import java.util.List;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-02 10:12
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public interface IAccountService {
    public boolean login(String name, String password) throws InterruptedException;
    public List<Account> findAll() throws InterruptedException;
    public boolean deleteAll();
    public Account find(int id) throws InterruptedException;
}
