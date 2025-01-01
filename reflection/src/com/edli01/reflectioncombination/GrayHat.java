package com.edli01.reflectioncombination;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01
 * @Author: MENG-JUN LI
 * @CreateTime: 2025-01-01 12:16
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class GrayHat {
    private String name;
    private int age;

    private GrayHat() {
    }

    private GrayHat(String name) {
        this.name = name;
    }
    private GrayHat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String speak(String topic) {
        return "很榮幸參加這次演講，今天帶來的主題是" + topic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
