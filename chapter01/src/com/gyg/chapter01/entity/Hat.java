package com.gyg.chapter01.entity;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 9:28 2017/9/28 0028
 * Q    Q: 1784286916
 * </pre>
 */
public class Hat {

    private String color;

    public Hat() {
    }

    public Hat(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Hat{" +
                "color='" + color + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }
}
