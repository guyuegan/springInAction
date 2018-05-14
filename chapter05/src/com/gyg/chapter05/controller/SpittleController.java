package com.gyg.chapter05.controller;

import com.gyg.chapter05.dao.ISpittleRepository;
import com.gyg.chapter05.entity.Spitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 9:36 2017/10/8 0008
 * Q    Q: 1784286916
 * </pre>
 */
@Controller
@RequestMapping(value = "spittles")
public class SpittleController {

    @Resource(name = "spittleRepository")
    private ISpittleRepository spittleRepository;

    public SpittleController(){

    }

    public SpittleController(ISpittleRepository spittleRepository){
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(@RequestParam(value = "max", defaultValue = "10000") long max,
        @RequestParam(value = "count", defaultValue = "10") int count, Model model){
        System.out.println("max: " + max);
        System.out.println("count: " + count);
        //将数据添加到模型
        model.addAttribute("spittleList", spittleRepository.findSpittles(max, count));
        return "spittles";
    }

  /*  @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public void getPathVariable(@PathVariable("spittleId") long spittleId){

        System.out.println("spittleId " + spittleId);
    }*/

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegisterForm(){
        return "registerForm";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String processRegisteration(/*@Valid*/ Spitter spitter /*BindingResult result*/){
        /*if (result.hasErrors()){
            return "registerForm";
        }*/
        System.out.println(spitter.getUsername());
        return null;
    }
}
