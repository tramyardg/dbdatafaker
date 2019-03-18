package com.dbdatafaker.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String firstName;
    private String lastName;
    private String address;

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setAddress(String address) {
        this.address = address;
    }

    public String buildQuery(int j) {
        String[] tableColumns = new String[]{
                "first_name", "last_name", "address"
        };
        String[] attributes = new String[]{
                firstName, lastName, address
        };
        String tableName = "employees";
        StringBuilder sql = new StringBuilder("INSERT INTO " + tableName + "(id,");
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < attributes.length; i++) {
            if (attributes[i] != null) {
                sql.append(tableColumns[i]).append(",");
                list.add(attributes[i]);
            }
        }
        j += 1; // auto increment id
        sql.append(") VALUES(").append(j).append(",");
        for (String s : list) {
            sql.append("\'").append(s).append("\'").append(",");
        }

        sql.append(");");
        sql = new StringBuilder(sql.toString().replaceAll(",\\)", ")"));
        return sql.toString();
    }
}
