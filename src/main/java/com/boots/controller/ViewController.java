package com.boots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/admin")
    public String admin() {

        return "admin";
    }

    @GetMapping("/user")
    public String user() {

        return "user";
    }
}
