package com.lance.study.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("hello")
    public String test(){
        return "welcome to eureka server";
    }

    @PostMapping("post")
    public String postTest(@RequestParam("parm") String name){

        return name;
    }


}
