package com.gyg.chapter04.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * 功    能: 观看演出的切面
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 1:55 2017/9/28 0028
 * Q    Q: 1784286916
 * </pre>
 */
@Component("audience_02")
public class Audience_02 {

    //表演开始前通知
    public void takeSeats(){

        System.out.println("taking seats");
    }

    //表演结束后通知
    public void applause(){

        System.out.println("clap clap clap !!!");
    }

    //表演失败后通知
    public void demandRefund(){

        System.out.println("demanding a refund");
    }
}
