package com.acprojects.filemetadata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String homePage(){
        return "Welcome to AC Projects - File Metadata API";
    }

}
