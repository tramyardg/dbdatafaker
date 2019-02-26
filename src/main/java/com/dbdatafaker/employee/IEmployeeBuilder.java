package com.dbdatafaker.employee;

public interface IEmployeeBuilder {

    IEmployeeBuilder buildFirstName();

    IEmployeeBuilder buildLastName();

    IEmployeeBuilder buildFullName();

    IEmployeeBuilder buildAddress();

    Employee build();

}
