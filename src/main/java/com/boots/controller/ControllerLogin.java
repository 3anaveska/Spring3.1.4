package com.boots.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerLogin {

    @GetMapping("/")
    public String home() {

        return "redirect:/login";
    }
}