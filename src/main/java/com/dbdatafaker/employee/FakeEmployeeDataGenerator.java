package com.dbdatafaker.employee;

import java.util.Locale;

import com.github.javafaker.Faker;

class FakeEmployeeDataGenerator {

    private Faker faker = new Faker(new Locale("en-CA"));

    FakeEmployeeDataGenerator() {

    }

    String generateFirstName() {
        return faker.name().firstName();
    }

    String generateLastName() {
        return faker.name().lastName();
    }

    String generateFullName() {
        return faker.name().fullName();
    }

    String generateAddress() {
        String streetAddress = faker.address().streetAddress();
        String city = faker.address().cityName();
        return streetAddress + ", " + city + ", " + faker.address().stateAbbr();
    }

}
