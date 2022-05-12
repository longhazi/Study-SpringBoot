package com.huanglong.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: HUANG LONG
 * @create: 2022-05-11 22:40
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello 这个世界！";
    }

    @RequestMapping("/test/{msg}")
    public String testString(@PathVariable String msg) {
        return "msg：" + msg;
    }
}
