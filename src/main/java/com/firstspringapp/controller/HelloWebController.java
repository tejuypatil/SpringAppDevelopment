package com.firstspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {
    @GetMapping("/web")
    public String hello(){
        return "hello";
    }
    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message","This is a custom message.Hello from Bridglabz");
        return "message";
    }
}
