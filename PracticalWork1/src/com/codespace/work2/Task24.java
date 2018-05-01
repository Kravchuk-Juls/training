package com.codespace.work2;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 2-4
 * ЗАДАНИЕ:
 * 1. Создайте в проекте PracticalWork2 новый пакет work24, в котором создайте класс Task24.
 * 2. Добавьте в класс Task24 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, который описывает две переменные целого типа
 *    и без объявления других переменных меняет местами их значения.
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте арифметические операции для получения результата.
 * 3. Используйте оператор System.out.println(...) для вывода исходных и результирующих значений.
 *
 */

public class Task24 {
    public static void main (String[] args) {
        short a1 = -1034;
        short a2 = 1033;

        System.out.println("Now a1 becomes a2 by ~a1 operation: " + ~a1);
        System.out.println("And vice versa a1 becomes a2: " + ~a2);

        /** case 2 - solved in class */
        int b1 = 10;
        int b2 = 24;

        System.out.println(b1 + " " + b2);

        b1 = b1 + b2;
        b2 = b2 - b1;
        b2 = -b2;
        b1 = b1 - b2;

        // or b1 = b1+b2; b2 = b1-b2; b1 = b1-b2;

        System.out.println(b1 + " " + b2);
    }
}
