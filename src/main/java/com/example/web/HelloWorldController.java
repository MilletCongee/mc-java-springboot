package com.example.web;

import com.example.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController：controller里面返回的结果都以json格式输出
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(String name) {
        //http://localhost:8080//hello?name=lol
        return "hello world, " + name + "。";
    }
    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setName("小明");
        user.setPass("xxxx");
        return user;
    }
}
