package com.example.probni_demo.service.impl;

import com.example.probni_demo.domain.Employee;
import com.example.probni_demo.service.DeportamentService;
import com.example.probni_demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.min;

@Service
public class DeportamentServiceImpl implements DeportamentService {
    private EmployeeService employeeService;
    public DeportamentServiceImpl(EmployeeService employeeService) {
    this.employeeService = employeeService;
    }
@Override
    public Optional<Employee> maxSalary(int departmentId){
        return employeeService.allEmployee().stream()
                .filter(e -> e.getDepartment()==departmentId)
                .max(Comparator.comparingInt(Employee::getSelary));

}
@Override
    public Optional<Employee> minSalary(int departmentId) {
        return employeeService.allEmployee().stream()
                .filter(e -> e.getDepartment()==departmentId)
                .min(Comparator.comparingInt(Employee::getSelary));
}

    @Override
    public List<Employee> allSalary(int departmentId) {
        return employeeService.allEmployee().stream()
                .filter(e -> e.getDepartment()==departmentId)
                .toList();
    }
     @Override
    public Map<Integer,List<Employee>> all() {
        return employeeService.allEmployee().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

     }

}
