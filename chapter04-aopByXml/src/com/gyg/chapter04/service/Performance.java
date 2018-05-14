package com.gyg.chapter04.service;

import org.springframework.stereotype.Component;

/**
 * <pre>
 * 功    能: 切面中切点的目标对象
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 1:50 2017/9/28 0028
 * Q    Q: 1784286916
 * </pre>
 */
@Component("performance")
public class Performance {

    public String perform(String actor){

        System.out.println(actor + "正在进行精彩的表演。。。");
        return "bow for audience";
    }


}
