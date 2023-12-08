package com.doutown.jwt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "adminDashboard";
    }

    @GetMapping("/user/dashboard")
    public String userDashboard() {
        return "userDashboard";
    }
}

