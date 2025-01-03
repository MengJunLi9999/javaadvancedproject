package main.java.com.edli01.genericclassandinterface;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01.genericclassandinterface
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-30 17:16
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
@Data
@NoArgsConstructor
public class Hacker {
    long id;
    String name;
    String country;
    /**
     * 1.BEGINNER
     * 2.INTERMEDIATE
     * 3.ADVANCED
     * 4.EXPERT
     */
    CodingSkillLevel csl;
    /**HackTool Variable Definition
     * 1.Nmap
     * 2.Metasploit
     * 3.Burp Suite
     * 4.Nessus
     * 5.SQLMap
     * 6.Wireshark
     * 7.Aircrack-ng
     * 8.OpenVAS
     * 上述12345678，若是擅長則顯示1，不擅長顯示0。以二進位表示，範例10110000，則表示擅長Nmap、Burp Suite、Nessus。
     */
    String hackerTool;

    public Hacker(long id, String name, String country, CodingSkillLevel csl, String hackerTool) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.csl = csl;
        this.hackerTool = hackerTool;
    }

    public long getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Hacker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", csl=" + csl +
                ", hackerTool='" + hackerTool + '\'' +
                '}';
    }
}
