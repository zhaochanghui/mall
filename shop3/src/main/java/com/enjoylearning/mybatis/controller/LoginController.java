package com.enjoylearning.mybatis.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ebapi/Login")
public class LoginController {

    @PostMapping(value = "/setCode")
    public String setCode(){
        return "abc";
    }
}
