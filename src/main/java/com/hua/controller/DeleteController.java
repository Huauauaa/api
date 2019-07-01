package com.hua.controller;

import com.hua.bean.Stuff;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteController {

    @DeleteMapping("/test/delete")
    public String getJson(@RequestBody Stuff stuff) {
        return stuff.toString();
    }
}
