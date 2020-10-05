package com.codersbay;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManagment {

    public static ArrayList<Person> allPersons = new ArrayList<>();

    public static void addPerson(Person person) {
        allPersons.add(person);
        System.out.println(person);
    }

    public static void removePerson(String scLastname) throws Exception {
        if (allPersons.isEmpty()) {
            throw new Exception("List is empty");
        }
        for (int i = 0; i < allPersons.size(); i++) {
            if (scLastname.equals(allPersons.get(i).lastname)) {
                allPersons.remove(allPersons.get(i));
            } else throw new Exception("This name could not be found.");
        }
        System.out.println(allPersons);
    }


    public static Person createNewPerson(String firstname, String lastname, String birthdate, Address address, Gender gender){
        Person person = new Person();
        person.firstname = firstname;
        person.lastname = lastname;
        person.birthdate = birthdate;
        person.address = address;
        person.gender = gender;

        return person;
    }

    public static Person createNewPerson() {
        Person person2 = new Person();
        person2.firstname = "Vanessa";
        person2.lastname = "Tiziani";
        person2.birthdate = "15.11.1993";
        person2.address = new Address("Linz", "Hillerstraße", 25, 4030);
        person2.gender = Gender.FEMALE;
        return person2;
    }

}
