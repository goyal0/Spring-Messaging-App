package com.springSecond.restApiSecond.RestController;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
    @GetMapping("/hello")
    String fn() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("message", "Hello World!");
        return "message";

    }
    @RequestMapping("/uc3")
    public String index() {
        return "hello from Dhananjay";
    }
}

