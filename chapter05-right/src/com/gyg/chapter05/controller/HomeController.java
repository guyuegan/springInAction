package com.gyg.chapter05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 1:22 2017/10/11 0011
 * Q    Q: 1784286916
 * </pre>
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/come", method = RequestMethod.GET)
    public String come(){
        return "come";
    }
}
