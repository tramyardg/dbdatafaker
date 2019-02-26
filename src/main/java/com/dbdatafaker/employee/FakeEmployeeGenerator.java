package com.dbdatafaker.employee;

import com.github.javafaker.Faker;

import java.util.Locale;

class FakeEmployeeGenerator {

    // TODO set local dynamically in runtime
    private Faker faker = new Faker(new Locale("en-CA"));

    FakeEmployeeGenerator() {

    }

    String generateFirstName() {
        return faker.name().firstName();
    }

    String generateLastName() {
        return faker.name().lastName();
    }

    String generateAddress() {
        String streetAddress = faker.address().streetAddress();
        String city = faker.address().cityName();
        return streetAddress + ", " + city + ", " + faker.address().stateAbbr();
    }

}
