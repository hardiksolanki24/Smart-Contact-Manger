package com.scm.Smart.Contact.Manger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home...");
        model.addAttribute("firstName","hardik");
        model.addAttribute("lastName","Solanki");
        return "Home";
    }
}
