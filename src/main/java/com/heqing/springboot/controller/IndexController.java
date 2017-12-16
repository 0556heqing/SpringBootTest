package com.heqing.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heqing on 2017/8/18.
 */
@RestController
@RequestMapping("/test")
public class IndexController {

    @RequestMapping(value = "index",produces = "text/plain;charset=UTF-8")
    String one(){
        return "Hello Spring Boot!";
    }
}
