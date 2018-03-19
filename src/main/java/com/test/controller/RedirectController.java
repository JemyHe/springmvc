package com.test.controller;

import com.test.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by 何冠雄 on 2018/2/12.
 */
@Controller
public class RedirectController {
    /**
     * 重定向通过HttpSession传值，不推荐
     * @param session
     * @return
     */
    /*@RequestMapping("/redirect/test1")
    public String test1(HttpSession session){
        session.setAttribute("username","张三");
        return  "redirect:/redirect/test2";
    }
    @RequestMapping("/redirect/test2")
    public void test2(HttpSession session){
        System.out.println(session.getAttribute("username"));
    }*/


    /**
     * 利用重定向后追加请求参数的方式传值，model和ra只能用于传递简单参数
     * @param ra springmvc提供的一种与model相同的子类，
     *           专门用于重定向传值，功能与model相同，意义上做区分
     * @return
     */
    @RequestMapping("/redirect/test1")
    public String test1(RedirectAttributes ra /*Model model*/){

        //重定向传值--基本类型
        //model.addAttribute("username","张三");
        ra.addAttribute("username","张三");

        //重定向传值---对象类型
        User user = new User();
        user.setName("haha");
        user.setAge(222);
        user.setHobby(Arrays.asList(1,2,3));
        user.setBirthday(new Date());
        ra.addFlashAttribute(user);
        return  "redirect:/redirect/test2";
    }

    @RequestMapping("/redirect/test2")
    public void test2(String username,ModelMap model){
        //取基本类型
        System.out.println(username);

        //取对象类型
        User user = (User)model.get("user");
        System.out.println(user);
    }



}
