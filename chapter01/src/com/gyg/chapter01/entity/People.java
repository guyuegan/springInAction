package com.gyg.chapter01.entity;

import java.util.List;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 9:26 2017/9/28 0028
 * Q    Q: 1784286916
 * </pre>
 */
public class People {

    private String name;
    private String age;
    private Hat hat;
    private List<Clothes> clothesList;

    public People() {
    }

    public People(String name, String age, Hat hat, List<Clothes> clothesList) {
        this.name = name;
        this.age = age;
        this.hat = hat;
        this.clothesList = clothesList;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", hat=" + hat +
                ", clothesList=" + clothesList +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setHat(Hat hat) {
        this.hat = hat;
    }

    public void setClothesList(List<Clothes> clothesList) {
        this.clothesList = clothesList;
    }
}
