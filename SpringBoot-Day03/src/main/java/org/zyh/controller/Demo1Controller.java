package org.zyh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zyh.pojo.Demo1;
import org.zyh.pojo.Demo2;
import org.zyh.pojo.Person;

/**
 * @author GG_B
 * @version 1.0
 */
@RestController
public class Demo1Controller {

    @Autowired
    Demo1 demo1;
    @Autowired
    Person person;
    @Autowired
    Demo2 demo2;

    @RequestMapping("demo1")
    public Demo1 demo1(){
        return demo1;
    }

    @RequestMapping("person")
    public Person person(){
        return person;
    }

    @RequestMapping("demo2")
    public Demo2 demo2(){
        //反正这样只有控制台有效果，前端看不出来
        System.out.println(demo2);
        return demo2;
    }
}
