package com.gyg.chapter02.soundSystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 5:00 2017/9/26 0026
 * Q    Q: 1784286916
 * </pre>
 */
@Configuration//声明为spring的配置类
//默认扫描配置类所在包中带有Component注解的bean
//@ComponentScan(basePackages = {"com.gyg.chapter01.soundSystem"})
@ComponentScan(basePackageClasses = {CDPlayerConfig.class})
public class CDPlayerConfig {
}
