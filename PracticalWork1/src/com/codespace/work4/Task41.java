package com.codespace.work4;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 4-1
 *
 * ЗАДАНИЕ:
 * 1. Создайте проект PracticalWork4 с пакетом work41, в котором создайте класс Task41.
 * 2. Добавьте в класс Task41 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, который описывает/вводит три переменные (любого типа)
 *    и вычисляет наибольшее значение из трех. Результат выводится на консоль.
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте new Scanner(System.in) для организации ввода с клавиатуры.
 * 3. Используйте оператор управления потоком исполнения if-else для определения результата.
 * 4. Используйте оператор System.out.println(...) для вывода результата.
 *
 */

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();

//         if (a > b) {
//             if (a > c) {
//                 System.out.println("a = " + a);
//             } else {
//                 System.out.println("c = " + c);
//             }
//         } else if (b > c) {
//             System.out.println("b = " + b);
//         } else {
//             System.out.println("c = " + c);
//         }

        /** case 2 - optimized */
        if (a > b && a > c) {
            System.out.println("a = " + a);
        } else if (b > a && b > c) {
                 System.out.println("b = " + b);
        } else {
             System.out.println("c = " + c);
        }

        /** case 3 - ternal */
        int max = (a > b && a > c) ? a :
                  (b > a && b > c) ? b : c ;
        System.out.println("max = " + max);
    }
}
