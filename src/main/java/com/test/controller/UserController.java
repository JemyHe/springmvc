package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 何冠雄 on 2018/2/12.
 */
@Controller
public class UserController {

    @RequestMapping("/user/add")
    public void add(){
        System.out.println("add方法");
    }

    @RequestMapping("/user/update")
    public void update(){
        System.out.println("update方法");
    }

    @RequestMapping("/user/find")
    public void find(){

    }

    @RequestMapping("/user/delete")
    public void delete(){

    }
}
