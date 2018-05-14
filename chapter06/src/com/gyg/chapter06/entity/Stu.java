package com.gyg.chapter06.entity;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 2:37 2017/10/10 0010
 * Q    Q: 1784286916
 * </pre>
 */
public class Stu {

    private int no;
    private String name;
    private int score;

    public Stu(){

    }

    public Stu(int no, String name, int score) {
        this.no = no;
        this.name = name;
        this.score = score;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
