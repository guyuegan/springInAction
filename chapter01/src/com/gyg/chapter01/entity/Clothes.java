package com.gyg.chapter01.entity;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 9:27 2017/9/28 0028
 * Q    Q: 1784286916
 * </pre>
 */
public class Clothes {

    private String category;

    public Clothes() {
    }

    public Clothes(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "category='" + category + '\'' +
                '}';
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
