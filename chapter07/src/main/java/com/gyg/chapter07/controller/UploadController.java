package com.gyg.chapter07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.File;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 3:26 2017/10/18 0018
 * Q    Q: 1784286916
 * </pre>
 */
@Controller
@RequestMapping("uploadController")
public class UploadController {

    @RequestMapping(value = "/uploadFile",method = RequestMethod.GET)
    public String uploadFile(){
        return "uploadFile";
    }

    @RequestMapping(value = "/uploadFile",method = RequestMethod.POST)
    public void uploadFile(HttpServletRequest request,
                           @RequestPart("uploadFile") MultipartFile uploadFile) throws Exception{

        /*//D:\Intellij Workspace\springInAction\chapter07\target\chapter07\
          String filePath = request.getSession().getServletContext().getRealPath("\\")
                + "src\\main\\webapp\\upload\\" + uploadFile.getOriginalFilename();*/

        String userDir = System.getProperty("user.dir");
        String filePath = userDir + "\\chapter07\\src\\main\\webapp\\upload\\"
                + uploadFile.getOriginalFilename();
        // 转存文件到最终保存的路径
        uploadFile.transferTo(new File(filePath));
    }

}
