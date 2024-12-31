package com.edli01.streamfinalmethod;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.streamfinalmethod
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-31 17:53
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class ＷhiteHat {
    String name;
    CodingSkillLevel codingSkillLevel;
    int salary;

    public ＷhiteHat(String name, CodingSkillLevel codingSkillLevel, int salary) {
        this.name = name;
        this.codingSkillLevel = codingSkillLevel;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CodingSkillLevel getCodingSkillLevel() {
        return codingSkillLevel;
    }

    public void setCodingSkillLevel(CodingSkillLevel codingSkillLevel) {
        this.codingSkillLevel = codingSkillLevel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ＷhiteHat{" +
                "name='" + name + '\'' +
                ", codingSkillLevel=" + codingSkillLevel +
                ", salary=" + salary +
                '}';
    }
}
