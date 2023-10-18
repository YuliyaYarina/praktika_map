package com.example.probni_demo.service;

import com.example.probni_demo.domain.Employee;

import java.util.Map;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    Employee removeEmployee(Employee employee);

    String searchEmployee(Employee employee);

    Map<String, Employee> allEmployee();
}
