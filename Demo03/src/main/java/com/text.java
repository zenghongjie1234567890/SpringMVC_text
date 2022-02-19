package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * SpringMVC_text
 *
 * @author : 曾小杰
 * @date : 2022-01-29 01:07
 **/
@Controller
public class text {
    @RequestMapping("/")
    public String text01(){
        return "index";
    }

    @RequestMapping("/testscopeAPI")
    public String text02(HttpServletRequest request){
        request.setAttribute("testscope","hello,text!!");
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView text03(){
        /**
         * ModelAndView有Model和View的功能
         * Model主要用于向请求域共享数据
         * View主要用于设置视图，实现页面跳转
         */
        ModelAndView mav = new ModelAndView();
        //向请求域共享数据
        mav.addObject("testscope", "hello,ModelAndView");
        //设置视图，实现页面跳转
        mav.setViewName("success");
        return mav;
    }

    @RequestMapping("testscopemodel")
    public String text04(Model model){
        model.addAttribute("testscope","hello,model");
        return "success";
    }

    @RequestMapping("testscopemap")
    public String text05(Map map){
        map.put("testscope","hello,map");
        return "success";
    }

    @RequestMapping("testscopemodelmap")
    public String text06(ModelMap modelMap){
        modelMap.addAttribute("testscope","hello,modelmap");
        return "success";
    }

    @RequestMapping("/testSession")
    public String text07(HttpSession session){
        session.setAttribute("testSessionScope", "hello,session");
        return "success";
    }

}
