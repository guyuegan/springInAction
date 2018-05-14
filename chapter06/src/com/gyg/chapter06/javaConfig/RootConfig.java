package com.gyg.chapter06.javaConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * <pre>
 * 功    能: 定义ContextLoaderListener应用上下文容器中的bean
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 3:45 2017/9/30 0030
 * Q    Q: 1784286916
 * </pre>
 */
@Configuration
@ComponentScan(basePackages = {
        "com.gyg.chapter06.controller",
        "com.gyg.chapter06.service"})
@EnableWebMvc
public class RootConfig {

}
