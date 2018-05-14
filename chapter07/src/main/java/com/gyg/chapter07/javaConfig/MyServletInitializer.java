package com.gyg.chapter07.javaConfig;

import com.gyg.chapter07.controller.MyFilter;
import com.gyg.chapter07.controller.MyServlet;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 2:04 2017/10/19 0019
 * Q    Q: 1784286916
 * </pre>
 */
public class MyServletInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext)
            throws ServletException {

        ServletRegistration.Dynamic myServlet =
                servletContext.addServlet("myServlet", MyServlet.class);
        myServlet.addMapping("/myServlet");

        FilterRegistration.Dynamic myFilter =
                servletContext.addFilter("myFilter", MyFilter.class);
        myFilter.addMappingForUrlPatterns(null, false, "/myFilter");
    }
}
