package com.nvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;
import java.security.PublicKey;

/**
 * SpringMVC_text
 *
 * @author : ��С��
 * @date : 2022-01-27 00:35
 **/
@Controller
public class controller {
    // ����ӳ�䣬�����ֵΪxml�����ӳ��·��
    @RequestMapping(value = "/")
    public String index(){
        // ������ͼ����,��Ϊҳ������
        return "index";
    }
    @RequestMapping(value = "/target")
    public String totarget(){
        return "target";
    }
}
