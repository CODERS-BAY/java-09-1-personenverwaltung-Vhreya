package com.codersbay;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

       Scanner sc = new Scanner(System.in);
        PersonManagment.addPerson(PersonManagment.createNewPerson());


       System.out.println("If you want to add a person type 'a', if you want to remove a person type 'r'.");

       if (sc.hasNext("a")) {
           sc.nextLine();
           System.out.println("Enter firstname:");
           String firstname = sc.nextLine();
           System.out.println("Enter lastname:");
           String lastname = sc.nextLine();
           System.out.println("Enter birthdate:");
           String birthdate = sc.nextLine();
           System.out.println("Enter Street, House Number, City and Post Code");
           Address address = new Address(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
           System.out.println("Enter gender:");
           Gender gender = Gender.fromCode(sc.nextInt());
           PersonManagment.addPerson(PersonManagment.createNewPerson(firstname, lastname, birthdate, address, gender));
       } else if (sc.hasNext("r")) {
           sc.nextLine();
           System.out.println("Type in the lastname of the person you want to remove:");
           String scLastname = sc.nextLine();
           PersonManagment.removePerson(scLastname);
       }
    }
}
