package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * SpringMVC_text
 *
 * @author : 曾小杰
 * @date : 2022-01-30 21:32
 **/
@Controller
public class text_Restful {

    // 模拟Get请求
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("查询所有用户信息");
        return "success01";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getById(){
        System.out.println("通过ID查询用户");
        return "success01";
    }


    // 模拟Post请求
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String inserUser(String username,String pwd){
        System.out.println("添加用户：用户名："+username+"密码："+pwd);
        return "success01";
    }

    // 模拟PUT请求
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String UpdateUser(String username,String pwd){
        System.out.println("更新用户：用户名："+username+"密码："+pwd);
        return "success01";
    }
}
