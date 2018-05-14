package com.gyg.chapter06.service;

import com.gyg.chapter06.entity.Stu;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 2:40 2017/10/10 0010
 * Q    Q: 1784286916
 * </pre>
 */
@Service(value = "stuService")
public class StuService {

    public List<Stu> findAll(){

        List<Stu> stuLs = new ArrayList<Stu>();

        stuLs.add(new Stu(1, "李磊", 100));
        stuLs.add(new Stu(2, "韩梅梅", 99));
        stuLs.add(new Stu(3, "小雷", 88));
        stuLs.add(new Stu(4, "大梅", 77));

        return stuLs;
    }
}
