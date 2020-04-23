package com.atguigu.springboot.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class HelloWorldControll {

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello World";
    }

}
