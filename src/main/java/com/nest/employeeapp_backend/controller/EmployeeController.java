package com.nest.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @PostMapping("/")
    public String  homepage(){
        return "Welcome to my website";
    }

    @GetMapping("/view")
    public String viewpage(){
        return "Welcome to View page";
    }

    @PostMapping("/add")
    public String addpage(){
        return "Welcome to Add page";
    }

    @PostMapping("/search")
    public String searchpage(){
        return "Welcome to Search page";
    }

    @PostMapping("/delete")
    public String deletepage(){
        return "Welcome to Delete page";
    }

    @PostMapping("/edit")
    public String editpage(){
        return "Welcome to Edit page";
    }


}
