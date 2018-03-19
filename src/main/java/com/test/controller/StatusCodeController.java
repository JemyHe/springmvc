package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 何冠雄 on 2018/2/12.
 */
@Controller
public class StatusCodeController {

    @RequestMapping("/404")
    public String a404(){
        return "404";
    }

    @RequestMapping("/error")
    public String error(){
        return "error";
    }
}
