package com.allin.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/index")
    public String sayHello(@RequestParam("user")String name, String pass){


        if("zhangsan".equals(name)&&"123".equals(pass)){
                return "hello";
        }

        return "";
    }
}
