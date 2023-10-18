package com.example.probni_demo.controller;

import com.example.probni_demo.service.EmployeeService;
import com.example.probni_demo.service.impl.DeportamentServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

//@RestController
//@RequestMapping("/departments")
//public class DeportamentController {
//    private final EmployeeService employeeService;
//    public DeportamentController(DeportamentServiceImpl employeeSelaryService, EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }

//        /departments/max-salary?departmentId=5
//    @GetMapping("/max-salary")
//        public String maxSalary(@RequestParam Integer departmentId) {
//
//        return "Сотрудник с макс ЗП: " + minSalary(departmentId) ;
//    }
//
//// /departments/min-salary?departmentId=5
//    @GetMapping("/min-salary")
//    public String minSalary(@RequestParam Integer departmentId) {
//
//        return "Сотрудник с мин ЗП: " + minSalary(departmentId);
//    }
//
/////departments/all?departmentId=5
//    @GetMapping("/all")
//    public String allSelary(@RequestParam Integer departmentId) {
//
//        return " Все сотрудники по отделу";
//    }
//
//    @GetMapping("/all")
//    public String all() {
//
//        return " Все сотрудники по отделам";
//    }



//    }
