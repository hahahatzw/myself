package com.tzw.mycircle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class TestFilterController {

    @GetMapping("/user")
    public String Test(){

        return "hh";
    }

}
