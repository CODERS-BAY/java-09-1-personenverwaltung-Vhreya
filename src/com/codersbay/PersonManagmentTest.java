package com.codersbay;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class PersonManagmentTest {

    @Test
    public void testEmptyPersonManagement() {
        assertTrue(PersonManagment.allPersons.isEmpty());
    }

    @Test
    public void testRemovePersonFromEmptyList() {
        String scLastname = "Tiziani";
        assertThrows(Exception.class, ()-> {
            PersonManagment.removePerson(scLastname);
        });
    }

    @Test
    public void testRemovePersonWhichIsNotInList() {
        String scLastname = "Huber";
        assertThrows(Exception.class, ()-> {
            PersonManagment.removePerson(scLastname);
        });
    }

    @Test
    public void testIfListShrinksWhenRemovePersons() throws Exception {
        PersonManagment.addPerson(PersonManagment.createNewPerson());
        assertEquals(1, PersonManagment.allPersons.size());
        PersonManagment.removePerson("Tiziani");
        assertEquals(0, PersonManagment.allPersons.size());
    }
}
