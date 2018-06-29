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
        weather.setTemp1("-2");
        weather.setTemp2("16");
        weather.setCity("Beijing");
        weather.setCityid("101010100");
        weather.setWeather("sunny");
        weather.setImg1("n0.gif");
        weather.setImg2("d0.gif");
        weather.setPtime("18:00");
        jsonObject.put("weatherinfo", weather);
        return jsonObject;
    }
}
