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
        return "Welcome to View page";
    }

    @GetMapping("/add")
    public String addpage(){
        return "Welcome to Add page";
    }

    @GetMapping("/search")
    public String searchpage(){
        return "Welcome to Search page";
    }

    @GetMapping("/delete")
    public String deletepage(){
        return "Welcome to Delete page";
    }

    @GetMapping("/edit")
    public String editpage(){
        return "Welcome to Edit page";
    }


}
