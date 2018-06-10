package com.codespace.workB29P1.task2;

import java.util.Scanner;

public class Runner {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("First name -> "); String name = sc.next();
        System.out.print("Last name -> "); String surname = sc.next();
        System.out.print("Age -> "); int age = sc.nextInt();
        Person person = new Person(name, surname);
        try {
            person.setAge(age);
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
        finally {
            System.out.println(person);
        }

    }
}
