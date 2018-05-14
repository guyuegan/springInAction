package com.gyg.chapter05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 3:52 2017/9/30 0030
 * Q    Q: 1784286916
 * </pre>
 */
@RequestMapping({"/", "homeController"})  //指明了这个类要处理的请求路径
@Controller
public class HomeController {

    @RequestMapping(value = "/myHome", method = RequestMethod.GET)
    public String home(){
        return "home";  //视图名为home
    }

}
