package com.harry.keycloak.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/harry")
public class DemoController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/customer")
    public String customer() {
        return "customer 能访问的服务";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "admin 能访问的服务";
    }
}
