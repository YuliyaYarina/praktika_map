package com.example.probni_demo.domain;

import org.springframework.util.StringUtils;

import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String lastName;
    private int selary;
    private int department;

    public Employee(String firstName, String lastName, int selary, int department) {

        this.firstName = StringUtils.capitalize(firstName.toLowerCase());
        this.lastName = StringUtils.capitalize(lastName.toLowerCase());
        this.selary = selary;
        this.department = department;
    }
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getSelary() {
        return selary;
    }
    public int getDepartment() {
        return department;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return selary == employee.selary && department == employee.department && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, selary, department);
    }

    @Override
    public String toString() {
        return "/ Employee " +
                " ФИО: " + getFirstName() + getLastName() +
                ", ЗП:  " + getSelary() +
                ", department " + getDepartment() ;

    }

}