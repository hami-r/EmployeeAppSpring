package com.nest.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String  homepage(){
        return "Welcome to my website";
    }

    @GetMapping("/view")
    public String viewpage(){
        return "View page";
    }

    @GetMapping("/add")
    public String addpage(){
        return "Add page";
    }

    @GetMapping("/search")
    public String searchpage(){
        return "Search page";
    }

    @GetMapping("/delete")
    public String deletepage(){
        return "Delete page";
    }
}
