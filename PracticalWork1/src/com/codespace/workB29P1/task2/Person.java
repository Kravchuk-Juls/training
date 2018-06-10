package com.codespace.workB29P1.task2;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public int getAge() { return age; }
    public void setAge(int age) throws InvalidAgeException {
        if (age <= 0 || age >120) {
            throw new InvalidAgeException("Wrong age input");
        }
        this.age = age; }

    @Override
    public String toString() {
        String result = "Person's profile: Name - " + firstName +
                " " + lastName + ", age - ";
        if (age == 0) {
            result += "unknown";
        } else {
            result += age;
        }
        return result;
    }
}
