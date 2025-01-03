package main.java.com.edli01.customizeexception;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.customizeexception
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-29 23:38
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class CustomizeRuntimeException extends RuntimeException {
    public CustomizeRuntimeException() {
    }

    public CustomizeRuntimeException(String message) {
        super(message);
    }
}
