package zyh.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zyh.pojo.Car;
import zyh.service.UserService;

/**
 * @author GG_B
 * @version 1.0
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    Car car;

    @RequestMapping("add")
    public String add(){
        userService.addUser();
        log.info("hello方法执行了");
        return "hello";
    }

    @RequestMapping("car")
    public Car car(){
        return car;
    }
}
