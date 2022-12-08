package com.codestates.practicegithubActiondeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 2022.12.8(목) 14h10
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "hello world! hello backend bootcamp!";
    }

}
