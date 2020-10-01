package com.codersbay;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       Person p1 = new Person("Christian", "Huber", "10.10.2020", "Musterstraße 2", "male");

       System.out.println("If you want to add a person type 'a', if you want to remove a person type 'r'.");

       if (sc.hasNext("a")) {
           PersonManagment.addPerson(PersonManagment.createAndAddNewPerson(sc));
       } else if (sc.hasNext("r")) {
           PersonManagment.removePerson(sc);
       }
    }
}
