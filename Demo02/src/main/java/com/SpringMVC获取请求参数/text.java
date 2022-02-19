package com.SpringMVC获取请求参数;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * SpringMVC_text
 *
 * @author : 曾小杰
 * @date : 2022-01-28 14:26
 **/
@Controller
public class text {
    @RequestMapping("/testparm")
    public String text01(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+" 和 "+password);
        return "target02";
    }
    // 获取的参数需要在该提交路径下的类下编写，即它post地址的路径
    @RequestMapping("/success")
    public String text01(String username,String pwd,String[] hobby){
        System.out.println(username);
        System.out.println(pwd);
        System.out.println(Arrays.toString(hobby));
        return "success";
    }

    @RequestMapping("/textparm03")
    public String text02(){
        return "target03";
    }

    @RequestMapping("/success01")
    public String text03(@RequestParam("user_name") String username, String pwd, String[] hobby){
        System.out.println(username);
        System.out.println(pwd);
        System.out.println(Arrays.toString(hobby));
        return "success";
    }

    @RequestMapping("/textparm04")
    public String text03(){
        return "target04";
    }

    @RequestMapping("/success02")
    public String text03(User user){
        System.out.println(user);
        return "success";
    }
}

class User{
    private String name;
    private String pwd;
    private String sex;
    private String age;
    private String email;

    public User() {
    }

    public User(String name, String pwd, String sex, String age, String email) {
        this.name = name;
        this.pwd = pwd;
        this.sex = sex;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
