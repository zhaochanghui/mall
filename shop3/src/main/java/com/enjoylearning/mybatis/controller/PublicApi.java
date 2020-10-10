package com.enjoylearning.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ebapi/public_api")
public class PublicApi {

    @GetMapping(value = "/index")
    public String setCode(){
        return "public_api-index";
    }
}
