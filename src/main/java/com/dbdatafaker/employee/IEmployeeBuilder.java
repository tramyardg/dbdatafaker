package com.dbdatafaker.employee;

public interface IEmployeeBuilder {

    IEmployeeBuilder buildFirstName();

    IEmployeeBuilder buildLastName();

    IEmployeeBuilder buildAddress();

    Employee build();

}
