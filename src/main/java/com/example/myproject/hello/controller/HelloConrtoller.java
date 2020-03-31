package com.example.myproject.hello.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author :liulin
 * @version 1.0
 * @ClassName: HelloConrtoller
 * @description: TODO
 * @date : 2020/3/31 11:26
 */
@Controller
@RequestMapping("/test")
public class HelloConrtoller {

    @ResponseBody
    @RequestMapping(value = "/hello", method = {RequestMethod.GET})
    public String hello(){
        return "hello";
    }

}