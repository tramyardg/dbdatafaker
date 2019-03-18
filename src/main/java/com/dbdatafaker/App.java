package com.dbdatafaker;

import com.dbdatafaker.employee.ConcreteEmployeeBuilder;

public class App {

    public static void main(String[] args) {

        int N = 5;
        for (int i = 0; i < N; i++) {
            System.out.println(new ConcreteEmployeeBuilder()
                    .buildFirstName()
                    .buildLastName()
                    .buildAddress()
                    .build().buildQuery(i));
        }


    }
}
