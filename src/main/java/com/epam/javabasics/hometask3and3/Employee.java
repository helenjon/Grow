//    "Create a class named Employee which is representing a company employee. The employee has a name, surname and ID.
//    Write a method in Employee class which prints this information (method print() ). Also please make sure to create methods
//    which can set the name, surname and ID, also the Employee class should have at least two constructors. The first one
//    accepts name and surname and sets the ID to a random value, and another one just sets the ID to a random number. N.B.
//    You could use a class named Random in Java to get random numbers.
//    Write another class with the main method which will test the Employee class by calling the print() method."

package com.epam.javabasics.hometask3and3;

class Employee {

    private final int id;
    private String name;
    private String surname;

    Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = (int) (Math.random() * 10000);
    }

    Employee() {
        id = (int) (Math.random() * 10000);
    }

    Employee(int id) {
        this.id = (int) (Math.random() * 10000);
    }


    void print() {
        System.out.println("Name  " + this.name);
        System.out.println("Surname  " + this.surname);
        System.out.println("ID  " + this.id);
    }
}
