package com.nest.employeeapp_backend.controller;

import com.nest.employeeapp_backend.dao.EmployeeDao;
import com.nest.employeeapp_backend.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;
    @GetMapping("/")
    public String  homepage(){
        return "Welcome to my website";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<EmployeeModel> viewpage(){
        return (List<EmployeeModel>)dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> addPage(@RequestBody EmployeeModel e){
        System.out.println("Name:" + e.getName());
        System.out.println("Employee Code:" + e.getEmployeeCode());
        System.out.println("Company Name:" + e.getCompanyName());
        System.out.println("Designation:" + e.getDesignation());
        System.out.println("Salary:" + e.getSalary());
        System.out.println("Mobile No:" + e.getMobileNo());
        System.out.println("Username:" + e.getUsername());
        System.out.println("Password:" + e.getPassword());
        dao.save(e);
        HashMap<String,String > map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search", consumes = "application/json", produces = "application/json")
    public List<EmployeeModel> searchPage(@RequestBody EmployeeModel e){
        String empCode = String.valueOf(e.getEmployeeCode());
        System.out.println(empCode);
        return (List<EmployeeModel>) dao.searchEmployee(e.getEmployeeCode());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> delete(@RequestBody EmployeeModel e){
        dao.deleteEmployee(e.getId());
        HashMap<String,String > map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/edit")
    public String editpage(){
        return "Welcome to Edit page";
    }


}
