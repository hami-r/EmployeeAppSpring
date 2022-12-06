package com.nest.employeeapp_backend.controller;

import com.nest.employeeapp_backend.model.EmployeeModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String addpage(@RequestBody EmployeeModel e){
        System.out.println("Name:" + e.getName());
        System.out.println("Employee Code:" + e.getEmployeeCode());
        System.out.println("Company Name:" + e.getCompanyName());
        System.out.println("Designation:" + e.getDesignation());
        System.out.println("Salary:" + e.getSalary());
        System.out.println("Mobile No:" + e.getMobileNo());
        System.out.println("Username:" + e.getUsername());
        System.out.println("Password:" + e.getPassword());
        return "Employee added successfully";
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
