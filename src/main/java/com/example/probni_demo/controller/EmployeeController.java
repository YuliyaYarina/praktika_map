package com.example.probni_demo.controller;

import com.example.probni_demo.domain.Employee;
import com.example.probni_demo.exceptions.EmployeeAlreadyAddedException;
import com.example.probni_demo.exceptions.EmployeeNotFoundException;
import com.example.probni_demo.exceptions.EmployeeStorageIsFullException;
import com.example.probni_demo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> allEmployee() {
        return employeeService.allEmployee();
    }
    @GetMapping("/add")
    public String addEmployee(@RequestParam String firstName,
                              @RequestParam String lastName,
                              @RequestParam Integer selary,
                              @RequestParam Integer department
    ){

        Employee employee = new Employee(
                firstName,
                lastName,
                selary,
                department
        );
        try {
        employeeService.addEmployee(employee);
        } catch ( EmployeeAlreadyAddedException e) {
            return "Уже такой есть сотрудник";
        } catch (EmployeeStorageIsFullException b) {
            return "Привышен лимит сотрудников";
        }
        final String emplN = ""
                + employee.getLastName() + " "
                + employee.getLastName() + " "
                + employee.getSelary() + " "
                + employee.getDepartment();
        return emplN;
    }

    @GetMapping("/remove")
    public String removeEmployee(@RequestParam String firstName,
                                 @RequestParam String lastName,
                                 @RequestParam Integer selary,
                                 @RequestParam Integer department
    ){
        Employee employee = new Employee(
                firstName,
                lastName,
                selary,
                department
        );

        try {
        employeeService.removeEmployee(employee);
        } catch (EmployeeAlreadyAddedException e) {
            return "Удаляемого сотрудника и так нет";
        }
        final String emplN = ""
                + employee.getLastName() + " "
                + employee.getLastName() + " "
                + employee.getSelary() + " "
                + employee.getDepartment();
        return emplN;
    }

    @GetMapping("/find")
    public String findEmployee(@RequestParam String firstName,
                               @RequestParam String lastName,
                               @RequestParam Integer selary,
                               @RequestParam Integer department
    ){
        Employee employee = new Employee(
                firstName,
                lastName,
                selary,
                department
        );
        try {
            employeeService.searchEmployee(employee);
        } catch (EmployeeNotFoundException e) {
            return "сотрудника нет";
        }
        final String emplN = ""
                + employee.getLastName() + " "
                + employee.getLastName() + " "
                + employee.getSelary() + " "
                + employee.getDepartment();
        return emplN;

    }
}
