package main.java.com.edli01.genericclassandinterface;

import lombok.NoArgsConstructor;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.genericclassandinterface
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-30 18:10
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
@NoArgsConstructor
public class HackerRuntimeException extends RuntimeException {
    public HackerRuntimeException(String message) {
        super(message);
    }
}
