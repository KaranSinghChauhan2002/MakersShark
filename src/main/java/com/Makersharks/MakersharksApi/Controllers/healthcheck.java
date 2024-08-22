package com.Makersharks.MakersharksApi.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")

public class healthcheck {
    @GetMapping
    public String health_get(){
        return "OK for Get";
    }
    @PostMapping
    public  String health_post(){
        return "OK for Post";
    }
}
