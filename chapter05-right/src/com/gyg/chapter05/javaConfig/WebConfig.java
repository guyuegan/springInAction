package com.gyg.chapter05.javaConfig;

import com.gyg.chapter05.controller.HomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * <pre>
 * 功    能: 定义DispatcherServlet应用上下文容器中的bean
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 3:18 2017/9/30 0030
 * Q    Q: 1784286916
 * </pre>
 */
@Configuration //声明该类为spring的javaConfig
@EnableWebMvc //启用springmvc
@ComponentScan(basePackageClasses = {HomeController.class}) //指定在哪个包扫描组件
public class WebConfig
        extends WebMvcConfigurerAdapter{

    /**
     * 配置视图解析器
     * @return
     */
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver =
                new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setExposeContextBeansAsAttributes(true);
        return viewResolver;
    }

    /**
     * 对静态资源请求的处理进行配置：
     * 我们要求DispatcherServlet对静态资源的请求，
     * 转到Servlet容器默认的Servlet中,
     * 而不是DispatcherServlet自身来处理
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
