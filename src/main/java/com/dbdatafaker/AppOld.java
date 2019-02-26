package com.dbdatafaker;

import com.github.javafaker.Faker;

import java.util.*;

public class AppOld {
    static Faker faker = new Faker(new Locale("en-CA"));

    public static void main(String[] args) {
        int idDigits = 5;
        generate(10);
    }

    public static void generate(int count) {
        System.out.println("Format (full name : full address : ssn : dob :  salary)");
        System.out.println("count: " + count);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < count; i++) {
            list.add(
                    generateID(5) + " : " +
                            generateName() + " : " +
                            generateAddress() + " : " +
                            generateSSN() + " : " +
                            generateFakeDOB() + " : " +
                            generateSalary() + "\n"
            );
        }
        System.out.println(list.toString());
    }

    private static String generateID(int digits) {
        return faker.number().digits(digits);
    }

    private static String generateName() {
        return faker.name().fullName();
    }

    private static String generateSSN() {
        String num = faker.idNumber().ssnValid().replaceAll("-", "");
        String first3 = num.substring(0, 3);
        String second3 = num.substring(3, 6);
        String last3 = num.substring(6);
        return first3 + "-" + second3 + "-" + last3;
    }

    private static String generateAddress() {
        String streetAddress = faker.address().streetAddress();
        String city = faker.address().cityName();
        return streetAddress + ", " + city + ", " + faker.address().stateAbbr();
    }

    private static String generateSalary() {
        String salary = String.valueOf(faker.number().randomDouble(5, 30000, 99999));
        return salary.substring(0, salary.indexOf("."));
    }

    private static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    private static String addZero4mmDD(int mm) {
        if (mm < 10) {
            return "0".concat(String.valueOf(mm));
        }
        return String.valueOf(mm);
    }

    private static String generateFakeDOB() {
        // https://stackoverflow.com/questions/3985392/generate-random-date-of-birth
        // format: yyyy-mm-dd
        GregorianCalendar gc = new GregorianCalendar();
        int year = randBetween(1950, 1997);
        gc.set(Calendar.YEAR, year);
        int dayOfYear = randBetween(1, gc.getActualMaximum(Calendar.DAY_OF_YEAR));
        gc.set(Calendar.DAY_OF_YEAR, dayOfYear);
        String month = addZero4mmDD((gc.get(Calendar.MONTH) + 1));
        String dayOfMonth = addZero4mmDD(gc.get(Calendar.DAY_OF_MONTH));
        return gc.get(Calendar.YEAR) + "-" + month + "-" + dayOfMonth;
    }

}
