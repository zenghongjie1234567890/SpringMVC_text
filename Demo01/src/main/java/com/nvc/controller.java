package com.nvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;
import java.security.PublicKey;

/**
 * SpringMVC_text
 *
 * @author : 曾小杰
 * @date : 2022-01-27 00:35
 **/
@Controller
public class controller {
    // 请求映射，里面的值为xml里面的映射路径
    @RequestMapping(value = "/")
    public String index(){
        // 返回视图名称,即为页面名称
        return "index";
    }
    @RequestMapping(value = "/target")
    public String totarget(){
        return "target";
    }
}
