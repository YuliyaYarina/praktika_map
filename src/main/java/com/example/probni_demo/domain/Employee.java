package com.example.probni_demo.domain;

import java.util.Objects;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final Integer selary;
    private final Integer department;

    public Employee(String firstName, String lastName, int selary, int department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.selary = selary;
        this.department = department;
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
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", selary=" + selary +
                ", department=" + department +
                '}';
    }
}