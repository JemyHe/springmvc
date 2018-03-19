package com.test.controller;

import com.test.entity.User;
import com.test.exception.MyException;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

/**
 * Created by 何冠雄 on 2018/2/11.
 */
@Controller
public class HelloController {

    /**
     * tomcat8 自动处理了get请求的乱码问题
     * @param name
     * @param age
     * @param birthday
     * @param hobby
     * @return
     */
    @RequestMapping(path = "/hello",method = RequestMethod.GET)
    public String helloGet(String name, Integer age, @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthday,@RequestParam List<Integer> hobby){
        System.out.println(name+"------"+age+"------"+birthday+"------["+hobby+"]");
        return "index";
    }

    /**
     * tomcat8 post请求需要在web.xml配置过滤器
     * @param name
     * @param age
     * @param birthday
     * @param hobby
     * @return
     */
    @RequestMapping(path = "/hello",method = RequestMethod.POST)
    public String helloPost(String name, Integer age, @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthday,@RequestParam List<Integer> hobby){
        System.out.println(name+"------"+age+"------"+birthday+"------["+hobby+"]");
        return "index";
    }

    /**
     * javaBean 作为参数接收
     * @param user
     * @return
     */
    @RequestMapping(path = "/hello1")
    public String helloPostParamBean(User user){
        System.out.println(user.toString());
        return "index";
    }

    /**
     * 接收路径参数
     * @param a
     * @param b
     * @return
     */
    @RequestMapping(path = "/hello/{id}/{num}")
    public String helloPostParamBean(@PathVariable("id") Integer a,@PathVariable("num")Integer b){
        System.out.println(a+"-----------------"+b);
        return "index";
    }

    @RequestMapping(path = "/hello3",method = RequestMethod.POST)
    public String hello3(){
        return "index";
    }

    @RequestMapping(path = "/hello4")
    public String hello4() throws MyException {
        foo();
        return "index";
    }

    private void foo() throws MyException{
        throw new MyException("自定义异常");
    }

    /**
     * 没有返回值会将requestMapping当作view路径
     */
    @RequestMapping("/hello5")
    public void hello5(){
        System.out.println("进入了hello5");
    }

}
