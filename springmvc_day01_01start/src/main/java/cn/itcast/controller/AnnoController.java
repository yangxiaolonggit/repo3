package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

/**
 * 常用的注解
 *
 */
@Controller
@RequestMapping(path = "/anno")
@SessionAttributes(value = {"msg"})
public class AnnoController {
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam("username") String uname){
        System.out.println(".....:"+uname);
        return"success";
    }

    /**
     * 获取cookie的值
     * @return
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue){

        System.out.println("执行了");
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * 测试modelAttribute注解
     * @return
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user){
        System.out.println("testModelAttribute执行了");
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public void showuser(){
        System.out.println("showuser方法执行了");
    }

    @RequestMapping("/testSessionAttribute")
    public String testSessionAttributes(Model model){
        //底层会存放在request域中
        model.addAttribute("msg","美美");

        return "success";
    }

    @RequestMapping("/testgetsessionAttribute")
    public String getSessionAttribute(ModelMap modelMap){
        //从session中获取值
        System.out.println(modelMap.get("msg"));
        return "success";
    }

    //删除
    @RequestMapping("/delSessionAttribute")
    public String delSessionAttribute(SessionStatus status){
        status.setComplete();
        return "success";
    }
}
