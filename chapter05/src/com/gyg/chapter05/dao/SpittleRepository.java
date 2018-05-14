package com.gyg.chapter05.dao;

import com.gyg.chapter05.entity.Spittle;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 1:27 2017/10/9 0009
 * Q    Q: 1784286916
 * </pre>
 */
@Repository("spittleRepository")
public class SpittleRepository implements ISpittleRepository {

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return createSpittleList(5);
    }

    private List<Spittle> createSpittleList(int count){

        List<Spittle> spittleList = new ArrayList<Spittle>();

        for (int i = 0; i < count; i++){
            spittleList.add(
                    new Spittle(i+1L, "spittle " + i,
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
            ));
        }

        return spittleList;
    }
}
