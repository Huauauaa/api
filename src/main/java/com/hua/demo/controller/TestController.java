package com.hua.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/22.
 */
@RestController
public class TestController {

    @GetMapping("/hi")
    public String test(){
        return "Hello";
    }
}
