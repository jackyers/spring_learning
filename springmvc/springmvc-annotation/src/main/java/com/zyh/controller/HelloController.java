package com.zyh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author GG_B
 * @version 1.0
 */
@Controller
@RequestMapping("hello")
public class HelloController {
    @RequestMapping("demo1")
    public String demo1(){
        return "success";
    }
}
