package com.codespace.work2;

/**
 *
 * ПРАКТИЧЕСКАЯ РАБОТА 2-1
 *
 * ЗАДАНИЕ:
 * 1. Создайте в проекте PracticalWork2 новый пакет work21, в котором создайте класс Task21.
 * 2. Добавьте в класс Task21 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, который вычисляет и выводит в консоль количество секунд в 3 неделях.
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте арифметические операции для вычисления.
 * 3. Используйте оператор System.out.println(...) для вывода результата вычисления.
 *
 */

public class Task21 {
    public static void main (String[] args) {
        int secondsPerWeek = 3 * 7 * 24 * 60 * 60;
        System.out.println("There are " + secondsPerWeek + " seconds in week.");
    }
}
