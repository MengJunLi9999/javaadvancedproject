package main.java.com.edli01;

import java.util.List;

import static java.lang.Thread.sleep;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-02 10:14
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class AccountService implements IAccountService{
    private static List<Account> accounts;

    static {
        accounts = List.of(
                new Account(1, "Penny", "123456abcdef#$%&", 1, 0),
                new Account(2, "Ken", "987654321abcdef#$%&", 2, 1),
                new Account(3, "Amy", "123456eefftt#$%&", 9, 0),
                new Account(4, "Tom", "123456abcdef#$%&", 6, 1),
                new Account(5, "Jerry", "123456abcdef#$%&", 5, 1)
        );
    }

    @Override
    public boolean login(String name, String password) throws InterruptedException {
        sleep(1000);
        if(name.equals("Admin123") && password.equals("123456abcdef#$%&")) {
            return true;
        }
        return false;
    }

    @Override
    public List<Account> findAll() throws InterruptedException {
        sleep(1000);
        return getAccounts();
    }

    @Override
    public boolean deleteAll() {
        setAccounts(null);
        return true;
    }

    @Override
    public Account find(int id) throws InterruptedException {
        sleep(1000);
        for(int i = 0; i < findAll().size(); i++) {
            if(id == findAll().get(i).getId()) {
                return findAll().get(i);
            }
        }
        return null;
    }

    public static List<Account> getAccounts() throws InterruptedException {
        sleep(1000);
        return accounts;
    }

    public static void setAccounts(List<Account> accounts) {
        AccountService.accounts = accounts;
    }
}
