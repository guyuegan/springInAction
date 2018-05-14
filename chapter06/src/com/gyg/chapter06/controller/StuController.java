package com.gyg.chapter06.controller;

import com.gyg.chapter06.entity.Stu;
import com.gyg.chapter06.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 2:46 2017/10/10 0010
 * Q    Q: 1784286916
 * </pre>
 */
@Controller
@RequestMapping("/stuController")
public class StuController {

    @Resource(name = "stuService")
    private StuService stuService;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public String findAll(HttpServletRequest request, HttpServletResponse response,
                          Model model){

        /*List<Stu> stuList = this.stuService.findAll();
        model.addAttribute("stuList", stuList);*/

        return "stuList";
    }

}
