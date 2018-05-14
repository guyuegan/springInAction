package com.gyg.chapter05.javaConfig;

import com.gyg.chapter05.controller.HomeController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 11:03 2017/10/11 0011
 * Q    Q: 1784286916
 * </pre>
 */
@Configuration
@ComponentScan(
            basePackageClasses = {HomeController.class},
            excludeFilters = {@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)}
        )
public class RootConfig {

}
