package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SpringMVC_text
 * <p>
 * <p>
 * 视图的控制器分类
 *
 * @author : 曾小杰
 * @date : 2022-01-29 16:29
 **/
@Controller
public class ViewController {

    @RequestMapping("testview")
    public String text01(){
        return "success";
    }

    // 转发：地址栏不变
    @RequestMapping("test_forward")
    public String text02(){
        return "forward:/testview";
    }

    // 重定向：地址栏会发生改变
    @RequestMapping("test_redirect")
    public String text03(){
        return "redirect:/testview";
    }
}
