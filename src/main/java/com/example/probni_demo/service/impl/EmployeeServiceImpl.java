package com.example.probni_demo.service.impl;

import com.example.probni_demo.domain.Employee;
import com.example.probni_demo.exceptions.EmployeeAlreadyAddedException;
import com.example.probni_demo.exceptions.EmployeeNotFoundException;
import com.example.probni_demo.exceptions.EmployeeStorageIsFullException;
import com.example.probni_demo.exceptions.IvalidInputException;
import com.example.probni_demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isAlpha;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final int STORAGE_SIZE =5;
   private final List<Employee> employees = new ArrayList<>();

    @Override
    public Employee addEmployee(Employee employee) {

        if (employees.size() > STORAGE_SIZE ) {
            throw new EmployeeStorageIsFullException("Привышен лимит сотрудников");
        }
        if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException("Уже такой есть сотрудник");
        }
        employees.add(employee);

        return employee;
    }

    @Override
    public Employee removeEmployee(Employee employee) {

        if (!employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException("Удаляемого сотрудника и так нет");
        }
            employees.remove(employee);

        return employee;
    }


    @Override
    public String searchEmployee(Employee employee) {

      if (employees.contains(employee)){
          return " сотрудник " + employee + " найден" ;
      } else {
          throw new EmployeeNotFoundException("Сoтрудник не найден");
      }
    }

    @Override
    public List<Employee> allEmployee() {
        return employees;
    }

    @Override
    public void validateImport(String firstName, String lastName) {
         if (!(isAlpha(firstName) && (isAlpha(lastName)))) {
             throw new IvalidInputException();
         }
     }
}
