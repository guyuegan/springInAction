package com.gyg.chapter05.javaConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 11:02 2017/10/11 0011
 * Q    Q: 1784286916
 * </pre>
 */
public class WebAppInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer{

    /**
     * 将一个或多个路径映射到DispatcherServlet上
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};    //将dispatcherServlet映射到"/"
    }

    /**
     * 此方法返回的带有@Configuration注解的类将会用来配置ContextLoaderListener创建的应用上下文中的Bean
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ RootConfig.class };
    }

    /**
     * 当DispatcherServlet启动的时候，它会创建Spring应用上下文，并加载配置文件或配置类中所声明的Bean。
     * DispatcherServlet加载应用上下文时，使用定义在WebConfig配置类中的Bean
     *
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{ WebConfig.class };   //springMvc配置
    }

}
