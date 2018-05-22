package com.codespace.workB25P1.task2;

public class Employee {
    private static int numberOfEmployees;

    private String firstName;
    private String lastName;
    private String occupation;
    private int telephone;

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getOccupation() { return occupation; }
    public int getTelephone() { return telephone; }
    public static int getNumberOfEmployees() { return numberOfEmployees; }

    public Employee(){
        this ("NoName", "NoSurname", "NoOccupation");
    }

    public Employee(String firstName, String lastName, String occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
    }

    public Employee(String firstName, String lastName, String occupation, int telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
    }

    public Employee(String firstName, String lastName) {
        this (firstName, lastName, "NoOccupation", 0000000);
        this.firstName = firstName;
        this.lastName = lastName;

    }

    {
        numberOfEmployees++;
    }
}
