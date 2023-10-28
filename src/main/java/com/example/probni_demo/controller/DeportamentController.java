package com.example.probni_demo.controller;

import com.example.probni_demo.domain.Employee;
import com.example.probni_demo.service.DeportamentService;
import com.example.probni_demo.service.EmployeeService;
import com.example.probni_demo.service.impl.DeportamentServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DeportamentController {
    private final EmployeeService employeeService;

    private DeportamentService deportamentService;

    public DeportamentController(EmployeeService employeeService, DeportamentService deportamentService) {
        this.employeeService = employeeService;
        this.deportamentService = deportamentService;
    }

    //        /departments/max-salary?departmentId=5
    @GetMapping("/max-salary")
        public String maxSalary(@RequestParam Integer departmentId) {

        return "Сотрудник с макс ЗП: " + deportamentService.maxSalary(departmentId) ;

    }

// /departments/min-salary?departmentId=5
    @GetMapping("/min-salary")
    public String minSalary(@RequestParam Integer departmentId) {

        return "Сотрудник с мин ЗП: " + deportamentService.minSalary(departmentId);
    }

///departments/all?departmentId=5
    @GetMapping("/all")
    public String allSelary(@RequestParam Integer departmentId) {

        return " Все сотрудники по отделу" + deportamentService.allSalary(departmentId);
    }

    @GetMapping()
    public String all() {
        return " Все сотрудники по отделам" + deportamentService.all();
    }
}
