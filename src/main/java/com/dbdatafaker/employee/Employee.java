package com.dbdatafaker.employee;

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

    @Override
    public String toString() {
        String first = "";
        String last = "";
        String ad = "";
        if (firstName != null) {
            first = "first_name,";
        }
        if (lastName != null) {
            last = "last_name,";
        }
        if (address != null) {
            ad = "address";
        }
        String q = "insert into employee (" + first + last + ad + ") values (";
        String out = q + "\"" + firstName + "\"" + "," +
                "\"" + lastName + "\"" + "," +
                "\"" + address + "\"" + ");";

        String s2 = out.replaceAll(",\\)", ")");
        String s3 = s2.replaceAll("\"null\",", "");
        return s3.replaceAll(",\"null\"\\);", ")");


    }
}
