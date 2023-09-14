package com.example.probni_demo.domain;

import java.util.Objects;

public class Driver extends Person {
    private String driverLicenseNumber;

    public Driver(String name, String surname, String passport, String driverLicenseNumber, int professionNumber) {
        super(name, surname, passport, professionNumber);
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Driver driver = (Driver) o;
        return Objects.equals(driverLicenseNumber, driver.driverLicenseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), driverLicenseNumber);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverLicenseNumber='" + driverLicenseNumber + '\'' +
                '}';
    }
}
