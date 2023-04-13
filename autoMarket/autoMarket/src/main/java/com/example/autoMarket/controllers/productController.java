package com.example.autoMarket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class productController {

    @GetMapping("/")
    public String products(){
        return "products";
    }
}
