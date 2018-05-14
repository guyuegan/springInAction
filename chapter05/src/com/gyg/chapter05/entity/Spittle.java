package com.gyg.chapter05.entity;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Date;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 1:31 2017/10/7 0007
 * Q    Q: 1784286916
 * </pre>
 */
public class Spittle {

    private Long id = 0L;
    private final String message;
    private final String time;
    private Double latitude;
    private Double longtude;

    public Spittle(Long id, String message, String time) {
        this.id = id;
        this.message = message;
        this.time = time;
    }

    public Spittle(String message, String time,
                   Double latitude, Double longtude) {
        this.message = message;
        this.time = time;
        this.latitude = latitude;
        this.longtude = longtude;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongtude() {
        return longtude;
    }

    public void setLongtude(Double longtude) {
        this.longtude = longtude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Spittle spittle = (Spittle) o;

        if (!id.equals(spittle.id)) return false;
        return time.equals(spittle.time);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + time.hashCode();
        return result;
    }
}
