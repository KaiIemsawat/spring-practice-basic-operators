package com.springdemo.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String homePage(Model viewModel) {
        viewModel.addAttribute("userName", "Zukk");
        viewModel.addAttribute("number", 2);
        viewModel.addAttribute("sleepTime", 8);
        viewModel.addAttribute("play", false);
        viewModel.addAttribute("walkTime", 3);
//        viewModel.addAttribute("attributeKey", "attributeValue");
//        attributeKey may be any meaningful name but need to match with what declared in HTML
//        attributeValue may be an object such as an instance of Entity/Model class
        return "home";
    }
}
