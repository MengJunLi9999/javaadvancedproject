package com.edli01;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-02 10:49
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class ProxyDemo {
    public static void main(String[] args) throws Exception {
        proxyExample01();
    }

    private static void proxyExample01() throws Exception{
        System.out.println("****************代理開始****************");
        //1. 創建代理對象
//        IAccountService accountService = new AccountService();
        IAccountService accountService = (IAccountService) TimeStatisticsProxy.createProxy(new AccountService());
        //2. 執行代理登入方法
        accountService.login("Admin123", "123456abcdef#$%&");
        //3. 執行代理全部查詢方法
        accountService.findAll();
        //4. 執行代理單一查詢方法
        accountService.find(1);
        //5. 執行代理刪除方法
        accountService.deleteAll();
        System.out.println("****************代理結束****************");
    }
}
