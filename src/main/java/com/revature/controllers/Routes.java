package com.revature.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Routes {

    @GetMapping("/")
    public String root(){
        return "fjklfjd";
    }

    @GetMapping("/fruits")
    public String fruits(){
        return "Bananas... Just bananas";
    }
}
