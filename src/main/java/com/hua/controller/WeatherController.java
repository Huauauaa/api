package com.hua.controller;

import com.alibaba.fastjson.JSONObject;
import com.hua.bean.Weather;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.QueryParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class WeatherController {

    @GetMapping("/data/citys")
    public JSONObject getCitys() {
        JSONObject jsonObject = new JSONObject();
        List<Weather> weathers = new ArrayList();
        Weather weather = new Weather();
        weather.setTemp1("-2");
        weather.setTemp2("16");
        weather.setCity("Beijing");
        weather.setCityid("101010100");
        weather.setWeather("sunny");
        weather.setImg1("n0.gif");
        weather.setImg2("d0.gif");
        weather.setPtime("18:00");
        weathers.add(weather);
        weathers.add(weather);
        weathers.add(weather);
        jsonObject.put("weatherinfo", weathers);
        return jsonObject;
    }

    @GetMapping("/data/city")
    public JSONObject getCity(@QueryParam("cityid") String cityid) {
        JSONObject jsonObject = new JSONObject();
        Weather weather = new Weather();
        weather.setTemp1("1");
        weather.setTemp2("11");
        weather.setCity("Beijing");
        weather.setCityid(cityid);
        weather.setWeather("sunny");
        weather.setImg1("n0.gif");
        weather.setImg2("d0.gif");
        weather.setPtime("18:00");
        jsonObject.put("weatherinfo", weather);
        return jsonObject;
    }
}
