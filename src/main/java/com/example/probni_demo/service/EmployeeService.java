package com.example.probni_demo.service;

import com.example.probni_demo.domain.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    Employee removeEmployee(Employee employee);

    String searchEmployee(Employee employee);

    Collection<Employee> allEmployee();
}
