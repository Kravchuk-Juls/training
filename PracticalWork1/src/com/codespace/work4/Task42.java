package com.codespace.work4;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 4-2
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork4 и добавьте в него пакет work42, в котором создайте класс Task42.
 * 2. Добавьте в класс Task42 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, в котором:
 *      – вводится переменная целого типа (например, с именем x);
 *      – выводится текст «Один», «Два», ..., «Девять», если значение переменной 1,2,...9,
 *        или «Другое», если значение переменной меньше 1 или больше 9;
 *      – определить выводимый текст двумя способами:
 *              - через цепочку операторов if-else’if;
 *              - через оператор switch.
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте new Scanner(System.in) для организации ввода с клавиатуры.
 * 3. Используйте оператор System.out.println(...) для вывода результата.
 *
 */

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x = ");
        int x = sc.nextInt();

        if ( x == 1) {
            System.out.println("One");
        } else if (x == 2) {
            System.out.println("Two");
        } else if (x == 3) {
            System.out.println("Three");
        } else if (x == 4) {
            System.out.println("Four");
        } else if (x == 5) {
            System.out.println("Five");
        } else if (x == 6) {
            System.out.println("Six");
        } else if (x == 7) {
            System.out.println("Seven");
        } else if (x == 8) {
            System.out.println("Eight");
        } else if (x == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Other");
        }

        switch (x) {
            case 1 :
                System.out.println("One");  break;
            case 2 :
                System.out.println("Two");  break;
            case 3 :
                System.out.println("Three"); break;
            case 4:
                System.out.println("Four"); break;
            case 5:
                System.out.println("Five"); break;
            case 6:
                System.out.println("Six"); break;
            case 7:
                System.out.println("Seven"); break;
            case 8:
                System.out.println("Eight"); break;
            case 9:
                System.out.println("Nine"); break;
            default:
                System.out.println("Other");
        }

    }
}
