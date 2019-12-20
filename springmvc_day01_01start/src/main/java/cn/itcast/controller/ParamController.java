package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 请求参数绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    /**
     * 请求参数绑定入门
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username){

        System.out.println("username:"+username);

        return "success";
    }
    /**
     * 请求参数封装JavaBean
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("将请求参数封装进javaBean中");
        System.out.println(account);
        return "success";
    }

    /**
     *自定义类型转换器
     */
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println("自定义类型转换器");
        System.out.println(user);
        return "success";
    }
    /**
     * 原生api获取
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("测试原生api获取");
        System.out.println(request);
        System.out.println(response);
        return "success";
    }
}
