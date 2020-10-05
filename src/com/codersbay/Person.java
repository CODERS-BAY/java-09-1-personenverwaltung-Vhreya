package com.codersbay;

import java.util.Date;

public class Person {
    public String firstname;
    public String lastname;
    public String birthdate;
    public Address address;
    public Gender gender;



    public Person(String firstname, String lastname, String birthdate, Address address, Gender gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.address = address;
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
