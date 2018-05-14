package com.gyg.chapter05.javaConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 2:59 2017/9/30 0030
 * Q    Q: 1784286916
 * </pre>
 */

/**
    扩展AbstractAnnotationConfigDispatcherServletInitializer的任意类，
    都会自动配置dispatcher-servlet和spring应用上下文，
    spring应用上下文会位于应用程序的servlet的上下文中
 */
public class SpittrWebAppInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class<?>[]{ RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class<?>[]{ WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
