package zyh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GG_B
 * @version 1.0
 */
@RestController// @Controller + @ResponseBody
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "Hello,springboot";
    }
}
