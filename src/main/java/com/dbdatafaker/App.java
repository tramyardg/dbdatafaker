package com.dbdatafaker;

import com.dbdatafaker.employee.ConcreteEmployeeBuilder;
import com.dbdatafaker.employee.IEmployeeBuilder;

public class App {

    public static void main(String[] args) {

        IEmployeeBuilder b = new ConcreteEmployeeBuilder();
        b.buildAddress();
        b.buildFullName();
        System.out.println(b.build().toString());

    }
}
