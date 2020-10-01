package com.codersbay;

import java.util.Date;

public class Person {
    public String firstname;
    public String lastname;
    public String birthdate;
    public String address;
    public String gender;

    public Person(String firstname, String lastname, String birthdate, String address, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.address = address;
        this.gender = gender;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
