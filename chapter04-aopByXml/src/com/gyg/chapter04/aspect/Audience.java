package com.gyg.chapter04.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
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
@Component("audience")
public class Audience {

    public void watchPerform(ProceedingJoinPoint joinPoint){

        try {

            System.out.println("taking seats...");
            Object returnVal = joinPoint.proceed();
            System.out.println("clap clap clap...");

            String targetMethodName = joinPoint.getSignature().getName();
            Object argsArr = joinPoint.getArgs()[0];
            System.out.println("目标方法名：" + targetMethodName);
            System.out.println("目标方法参数：" + argsArr.toString());
            System.out.println("目标方法返回值：" + returnVal.toString());

            throw new Exception();
        } catch (Throwable throwable) {
            System.out.println("demanding a refund...");
        }
    }

    public void say(){
        System.out.println("i love this perform");
    }
}
