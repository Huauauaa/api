package com.hua.controller;

import com.alibaba.fastjson.JSONObject;
import com.hua.bean.Demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/data")
    public JSONObject getJson() {
        JSONObject jsonObject = new JSONObject();
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("Liuchao");
        jsonObject.put("man", demo);
        return jsonObject;
    }
}
