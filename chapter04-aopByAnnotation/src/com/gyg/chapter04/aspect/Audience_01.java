package com.gyg.chapter04.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * <pre>
 * 功    能: 观看演出的切面
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 1:55 2017/9/28 0028
 * Q    Q: 1784286916
 * </pre>
 */
@Aspect//此注解表明Audience不仅是POJO，还是一个切面
public class Audience_01 {

    //表演开始前
    @Before("execution(** com.gyg.chapter04.service.Performance.perform(..))")
    public void silenceCellPhone(){

        System.out.println("silencing cell phone");
    }

    //表演开始前
    @Before("execution(** com.gyg.chapter04.service.Performance.perform(..))")
    public void takeSeats(){

        System.out.println("taking seats");
    }

    //表演结束后
    @AfterReturning("execution(** com.gyg.chapter04.service.Performance.perform(..))")
    public void applause(){

        System.out.println("clap clap clap !!!");
    }

    //表演失败后
    @AfterThrowing("execution(** com.gyg.chapter04.service.Performance.perform(..))")
    public void demandRefund(){

        System.out.println("demanding a refund");
    }
}
