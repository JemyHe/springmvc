package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 何冠雄 on 2018/2/12.
 * 使用servlet3.0 实现文件上传：
 * 1.web.xml 中配置multipart-config ,启动servlet对文件上传支持
 * 2.spring.xml 中配置multipart解析器，用StandardServletMultipartResolver实现类
 */
@Controller
public class ServletUploadController {

    @RequestMapping("/upload")
    public String upload(MultipartFile file){
        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getOriginalFilename());
        return "index";
    }

    @RequestMapping("/uploadpage")
    public String page(){
        return "fileupload";
    }

}
