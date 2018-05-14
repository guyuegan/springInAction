package com.gyg.chapter07.javaConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 3:06 2017/10/18 0018
 * Q    Q: 1784286916
 * </pre>
 */

/**
 扩展AbstractAnnotationConfigDispatcherServletInitializer的任意类，
 都会自动配置dispatcher-servlet和spring应用上下文，
 spring应用上下文会位于应用程序的servlet的上下文中
 */
public class WebInitializer
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
        return new String[]{ "/" };
    }

    /**
     * customize: 定制
     * 在注册了dispathcerServlet后，进一步配置
     */
    @Override
    protected void customizeRegistration(
            ServletRegistration.Dynamic registration) {
        //配置上传文件的临时存放位置和限制上传文件的大小
        registration.setMultipartConfig(
                new MultipartConfigElement(
                        "", //文件临时保存的位置
                        2097152,
                        4194304,
                        0
                )
        );
    }
}
