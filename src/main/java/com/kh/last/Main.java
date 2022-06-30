package com.kh.last;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Person person = new Person("John", "Doe", 1990);
        Person person2 = new Person("Jane", "Doe", 1991);
        Person person3 = new Person("John", "Doe", 1992);
        Person person4 = new Person("John", "Doe", 1993);
        Person person5 = new Person("John", "Doe", 1994);


        System.out.println(person3.getName());


    }
}
