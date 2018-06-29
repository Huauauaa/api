package com.hua.controller;

import com.alibaba.fastjson.JSONObject;
import com.hua.bean.Weather;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @GetMapping("/data/cityinfo/101010100.html")
    public JSONObject getJson() {
        JSONObject jsonObject = new JSONObject();
        Weather weather = new Weather();
        weather.setId("1");
        weather.setName("Beijing");
        jsonObject.put("weatherinfo", weather);
        return jsonObject;
    }
}
