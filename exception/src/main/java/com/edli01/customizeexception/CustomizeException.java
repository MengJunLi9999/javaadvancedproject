package main.java.com.edli01.customizeexception;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.customizeexception
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-29 22:59
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
//繼承Exception，重寫建構子，提供調用自定義異常的機制。
public class CustomizeException extends Exception {
    public CustomizeException() {
    }

    public CustomizeException(String message) {
        super(message);
    }
}
