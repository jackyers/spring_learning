package org.zyh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author GG_B
 * @version 1.0
 */
@Controller
/*@Controller*/
public class ParamController {
    @RequestMapping("aa/{userId}/mm/{num}")
//    http://localhost:8080/aa/789/mm/333
    public String testPathVariable(@PathVariable("userId") String id,@PathVariable("num") Integer num){
        System.out.println(id);
        System.out.println(num);
        return "testPathVariable";
    }

    @RequestMapping("aa")
//    http://localhost:8088/aa?uu=22&user=44
    public String testRequestParam(String uu,@RequestParam("user") Integer age,@RequestParam(value = "num",required = false,defaultValue = "0") Integer num){
        System.out.println(uu);
        System.out.println(age);
        System.out.println(num);
        return "testRequestParam";
    }

    @RequestMapping("getData")
    public String getData(@RequestBody() String data){
        System.out.println(data);
        return data;
    }

    @RequestMapping("getCookies")
    public String getCookies(@CookieValue("Idea-ea641abf") String cookies){
        System.out.println(cookies);
        return cookies;
    }

    @RequestMapping("getHeader")
    public String getHeader(@RequestHeader("Dnt") String header){
        System.out.println(header);
        return header;
    }

//    这里要用controller注解，不能用RestController
    @RequestMapping("/test1")
    public String test1(HttpServletRequest request){
        request.setAttribute("username","jack");
        return "forward:/test1";
    }

    @RequestMapping("/test2")
    public String test2(@RequestAttribute("username") String name){
        System.out.println(name);
        return name;
    }
}
