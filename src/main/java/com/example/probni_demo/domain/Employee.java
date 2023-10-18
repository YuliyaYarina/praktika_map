package com.example.probni_demo.domain;

import java.util.Objects;

public class Employee {

    private final String name;
    private final String surname;
    private final Integer selary;
    private final Integer department;

    public Employee(String name, String surname, int selary, int department) {
        this.name = name;
        this.surname = surname;
        this.selary = selary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
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
        return selary == employee.selary && department == employee.department && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, selary, department);
    }

    @Override
    public String toString() {
        return "Employee:" +
                "name= " + name +
                ", surname= " + surname +
                ", selary= " + selary +
                ", department= " + department + "/";
    }
}