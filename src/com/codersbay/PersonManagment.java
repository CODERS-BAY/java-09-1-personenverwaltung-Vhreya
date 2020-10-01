package com.codersbay;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManagment {

    public static ArrayList<Person> allPersons = new ArrayList<>();

    public static void addPerson(Person p) {
        allPersons.add(p);
        System.out.println(p);
    }

    public static void removePerson(Scanner sc) {
        sc.nextLine();
        System.out.println("Type in the lastname of the person you want to remove:");
        String scLastname = sc.nextLine();
        for (int i = 0; i < allPersons.size(); i++) {
            if (scLastname.equals(allPersons.get(i).lastname)) {
                allPersons.remove(allPersons.get(i));
            }
        }
        System.out.println(allPersons);
    }


    public static Person createAndAddNewPerson(Scanner sc){
        Person p = new Person();
        sc.nextLine();
        System.out.println("Enter firstname:");
        p.firstname = sc.nextLine();
        System.out.println("Enter lastname:");
        p.lastname = sc.nextLine();
        System.out.println("Enter birthdate:");
        p.birthdate = sc.nextLine();
        System.out.println("Enter address:");
        p.address = sc.nextLine();
        System.out.println("Enter gender:");
        p.gender = sc.nextLine();
        return p;
    }

}
