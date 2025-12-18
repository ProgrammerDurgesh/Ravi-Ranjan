package org.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Test {

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
