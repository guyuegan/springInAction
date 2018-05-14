package com.gyg.chapter07.controller;

import javax.servlet.*;
import java.io.IOException;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 2:20 2017/10/19 0019
 * Q    Q: 1784286916
 * </pre>
 */
public class MyFilter implements Filter {

    private String charEncoding;

    //filterConfig用于从web.xml中读取filter的配置
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        charEncoding = "utf-8";
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding(charEncoding); //设置请求
        servletResponse.setCharacterEncoding(charEncoding); //设置响应
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println(charEncoding);
    }

    @Override
    public void destroy() {

    }
}
