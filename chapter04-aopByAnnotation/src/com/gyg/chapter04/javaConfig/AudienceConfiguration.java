package com.gyg.chapter04.javaConfig;

import com.gyg.chapter04.aspect.Audience;
import com.gyg.chapter04.service.Performance;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <pre>
 * 功    能: spring配置类
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 2:35 2017/9/28 0028
 * Q    Q: 1784286916
 * </pre>
 */
@Configuration
@EnableAspectJAutoProxy//启用AspectJ自动代理
@ComponentScan(basePackageClasses = {Performance.class, Audience.class})
public class AudienceConfiguration {

   /* @Bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    public Performance performance(){
        return new Performance();
    }*/
}
