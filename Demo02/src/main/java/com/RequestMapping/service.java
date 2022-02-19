package com.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SpringMVC_text
 *
 * @author : ��С��
 * @date : 2022-01-27 14:27
 **/
@Controller
public class service {

    @RequestMapping("/")
    public String index(){
        return "jie";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "target";
    }
    @RequestMapping(value = {"/h1","/h2"})
    public String test1(){
        return "target01";
    }

    @RequestMapping("testRest/{id}/{name}")
    // ·���е�վλ�����õ���ࣨ�ص㣩
    public String test02(){
        return "target01";
    }
}
