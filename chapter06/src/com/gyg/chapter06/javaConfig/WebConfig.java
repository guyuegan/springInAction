package com.gyg.chapter06.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;

/**
 * <pre>
 * 功    能: 定义DispatcherServlet应用上下文容器中的bean
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 3:18 2017/9/30 0030
 * Q    Q: 1784286916
 * </pre>
 */
@Configuration//声明该类为spring的java Config
@EnableWebMvc//开启springMvc
@ComponentScan(basePackages = {"com.gyg.chapter06.controller"})
public class WebConfig
                extends WebMvcConfigurerAdapter{

    /*
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver =
                new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setExposeContextBeansAsAttributes(true);
        return viewResolver;
    }*/

    /*Thymeleaf视图解析器*/
    @Bean
    public ViewResolver viewResolver(
            TemplateEngine templateEngine){
        ThymeleafViewResolver viewResolver =
                new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine);
        return viewResolver;
    }

    /*模板引擎*/
    @Bean
    public TemplateEngine templateEngine(
            SpringResourceTemplateResolver springResourceTemplateResolver){
        SpringTemplateEngine springTemplateEngine =
                new SpringTemplateEngine();
        springTemplateEngine.setTemplateResolver(springResourceTemplateResolver);
        return springTemplateEngine;
    }

    /*模板解析器*/
    @Bean
    public SpringResourceTemplateResolver springResourceTemplateResolver(){
        SpringResourceTemplateResolver springResourceTemplateResolver =
                new SpringResourceTemplateResolver();
        springResourceTemplateResolver.setPrefix("/WEB-INF/templates/");
        springResourceTemplateResolver.setSuffix(".html");
        springResourceTemplateResolver.setTemplateMode("HTML5");
        return springResourceTemplateResolver;
    }


    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
