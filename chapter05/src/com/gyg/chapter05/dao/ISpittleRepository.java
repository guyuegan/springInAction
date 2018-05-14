package com.gyg.chapter05.dao;

import com.gyg.chapter05.entity.Spittle;

import java.util.List;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 1:28 2017/10/7 0007
 * Q    Q: 1784286916
 * </pre>
 */
public interface ISpittleRepository {

    public List<Spittle> findSpittles(long max, int count);
}
