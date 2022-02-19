package com;

import bean.user;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * SpringMVC_text
 *
 * @author : 曾小杰
 * @date : 2022-02-07 16:43
 **/
@Controller
public class HttpMessageConverter {

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println("requestBody:"+requestBody);
        return "success";
    }

    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity){
        System.out.println("requestHeader:"+requestEntity.getHeaders());
        System.out.println("requestBody:"+requestEntity.getBody());
        return "success";
    }

    // 加个ResponseBody注解后，可以将java对象转换为json文件响应带浏览器
    @RequestMapping("/testResponseBody")
    @ResponseBody
    public user testResponseBody() {
        return new user(1,"曾鸿杰","男");
    }

    // SpringMVC处理ajax
    @RequestMapping("/testAjax")
    @ResponseBody
    public String testAjax(String username, String pwd){
        System.out.println("username:"+username+",password:"+pwd);
        return "hello,ajax";
    }


}

