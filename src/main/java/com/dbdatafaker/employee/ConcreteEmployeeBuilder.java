package com.dbdatafaker.employee;

public class ConcreteEmployeeBuilder implements IEmployeeBuilder {
    private FakeEmployeeDataGenerator generate;
    private Employee employee;

    public ConcreteEmployeeBuilder() {
        this.employee = new Employee();
        this.generate = new FakeEmployeeDataGenerator();
    }

    public IEmployeeBuilder buildFirstName() {
        employee.setFirstName(this.generate.generateFirstName());
        return this;
    }

    public IEmployeeBuilder buildLastName() {
        employee.setLastName(this.generate.generateLastName());
        return this;
    }

    public IEmployeeBuilder buildFullName() {
        employee.setFullName(this.generate.generateFullName());
        return this;
    }

    public IEmployeeBuilder buildAddress() {
        employee.setAddress(this.generate.generateAddress());
        return this;
    }

    public Employee build() {
        return employee;
    }


}
