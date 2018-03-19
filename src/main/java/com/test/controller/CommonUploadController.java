package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 何冠雄 on 2018/2/12.
 */
@Controller
public class CommonUploadController {

    @RequestMapping("/upload1")
    public String upload(MultipartFile file){
        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getOriginalFilename());
        return "index";
    }

    @RequestMapping("/uploadpage1")
    public String page(){
        return "fileupload";
    }
}
