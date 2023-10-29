package com.example.probni_demo.service;


import com.example.probni_demo.domain.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    Employee removeEmployee(Employee employee);

    String searchEmployee(Employee employee);

    List<Employee> allEmployee();

    void validateInput(String firstName, String lastName);
}
