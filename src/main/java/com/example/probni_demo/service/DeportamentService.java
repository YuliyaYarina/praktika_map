package com.example.probni_demo.service;

import com.example.probni_demo.domain.Employee;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface DeportamentService {
    Optional<Employee> maxSalary(int departmentId);

    Optional<Employee> minSalary(int departmentId);

    List<Employee> allSalary(int departmentId);


    Map<Integer,List<Employee>> all();
}
