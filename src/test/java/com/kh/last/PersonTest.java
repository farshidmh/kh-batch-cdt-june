package com.kh.last;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void test1() {

        Person  person = new Person("John", "Doe", 1990);

        assertEquals("John", person.getName());

    }

    @org.junit.jupiter.api.Test
    void test2() {

        Person  person = new Person("John", "Doe", 1990);

        assertEquals(32, person.getAge());

    }

}