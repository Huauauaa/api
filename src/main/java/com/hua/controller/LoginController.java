package com.hua.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.QueryParam;

@RestController
public class LoginController {

    @GetMapping("/login")
    public JSONObject getCity(@QueryParam("username") String username, @QueryParam("password") String password) {
        JSONObject jsonObject = new JSONObject();
        if ("admin".equals(username) && "1".equals(password)) {
            jsonObject.put("user", username);
        } else {
            jsonObject.put("user", null);
        }
        return jsonObject;
    }
}
