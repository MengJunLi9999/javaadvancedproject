package com.edli01.annotationbase;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.annotationbase
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-01 17:33
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
@IAmAnnotationNO1(name = "IAmClassTest", age = 40, skills = {"Java", "Python", "Assembly"})
public class INeedAnnotation {
    @IAmAnnotationNO1(name = "IAmMethodTest", age = 45, skills = {"Cook"})
    public void shareInformation() {}
}
