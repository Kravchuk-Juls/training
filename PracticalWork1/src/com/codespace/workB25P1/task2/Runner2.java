package com.codespace.workB25P1.task2;

public class Runner2 {
    public void run() {
        new Employee("Kate", "Smith", "accountant", 1112233);
        new Employee("Louis", "Goldfisher");
        new Employee("Samuel", "Black", "web-designer");
        new Employee();

        System.out.println("Number of employees : " + Employee.getNumberOfEmployees());

    }
}
