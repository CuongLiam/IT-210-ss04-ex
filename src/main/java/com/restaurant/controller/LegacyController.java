package com.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LegacyController {
    @GetMapping("/")
    public String sayHello() {
        return "index"; // Sẽ trỏ về /WEB-INF/views/index.jsp
    }
}