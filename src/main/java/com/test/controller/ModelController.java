package com.test.controller;

import com.test.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by 何冠雄 on 2018/2/12.
 */
@Controller
public class ModelController {

    @RequestMapping("/model/test1")
    public void test1(Model model){
        User u = new User();
        u.setName("里斯");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setHobby(Arrays.asList(1,2,3));
        model.addAttribute("u",u);
        //model.addAttribute(u); //自动将u作为key存储在request中，等同于上一句
    }

    @RequestMapping("/model/test2")
    public void test2(Model model){
        User u = new User();
        u.setName("里斯");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setHobby(Arrays.asList(1,2,3));
        User u2 = new User();
        u2.setName("里斯2");
        u2.setAge(22);
        u2.setBirthday(new Date());
        u2.setHobby(Arrays.asList(2,3));
        List<User> list = new ArrayList<>();
        list.add(u);
        list.add(u2);
        model.addAttribute(list);//自动拼接成userList
    }

    @RequestMapping("/model/test3")
    public void test3(){

    }

    /*@RequestMapping("/model/test4")
    public void test4(User user,Model model){
        model.addAttribute(user);
    }*/

    /**
     * 等价于上面注释的方法
     * @param user
     * ModelAttribute注解将user存入model中，不用再写代码
     * 不写入user就是将参数名作为key
     */
    @RequestMapping("/model/test4")
    public void test4(@ModelAttribute("user") User user){

    }


}
