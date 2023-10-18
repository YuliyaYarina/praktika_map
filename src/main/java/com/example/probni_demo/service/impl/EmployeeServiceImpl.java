package com.example.probni_demo.service.impl;

import com.example.probni_demo.domain.Employee;
import com.example.probni_demo.exceptions.EmployeeAlreadyAddedException;
import com.example.probni_demo.exceptions.EmployeeNotFoundException;
import com.example.probni_demo.exceptions.EmployeeStorageIsFullException;
import com.example.probni_demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final int STORAGE_SIZE =6;
    Map<String, Employee> employees = new HashMap<>(Map.of(
            "12345",
            new Employee(
                    "Жан",
                    "Рено",
                    10000,
                    2),
            "54321",
            new Employee(
                    "Люк",
                    "Бессон",
                    15000,
                    3),
            "41232",
            new Employee(
                    "Жерар",
                    "Депардье",
                    16400,
                    0),
            "928374",
            new Employee(
                    "Джейсон",
                    "Стетхем",
                    21000,
                    1),
            "1000",
            new Employee(
                    "Жерар",
                    "Депардье",
                    18000,
                    4)
    ));

    @Override
    public Employee addEmployee(Employee employee) {

        if (employees.size() > STORAGE_SIZE ) {
            throw new EmployeeStorageIsFullException("Привышен лимит сотрудников");
        }

        String fullName = getFullName(employee);

        if (employees.containsKey(fullName)) {
            throw new EmployeeAlreadyAddedException("Уже такой есть сотрудник");
        }

        employees.put(fullName, employee);
        return employee;
    }

    @Override
    public Employee removeEmployee(Employee employee) {

        String fullName = getFullName(employee);

        if (!employees.containsKey(fullName)) {
            throw new EmployeeAlreadyAddedException("Удаляемого сотрудника и так нет");
        }
            employees.remove(employee);

        return employee;
    }

    @Override
    public String searchEmployee(Employee employee) {

        String fullName = getFullName(employee);

      if (employees.containsKey(fullName)){
          return " сотрудник " + employee + " найден" ;
      } else {
          throw new EmployeeNotFoundException("Сoтрудник не найден");
      }
    }

    @Override
    public Map<String, Employee> allEmployee() {
        return employees;
    }

    public String getFullName(Employee employee){
        return employee.getName() + employee.getSurname();
    }

}
