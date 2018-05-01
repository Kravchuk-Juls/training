package com.codespace.work3;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 3-2
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork3 и добавьте в него пакет work32, в котором создайте класс Task32.
 * 2. Добавьте в класс Task32 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, который вычисляет и выводит в консоль сумму прибыли
 *    по заданному депозиту на заданное количество месяцев под 12% годовых.
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте описания переменных для хранения значений депозита и его длительности.
 * 3. Используйте арифметические операции для вычисления.
 * 4. Используйте оператор System.out.println(...) для вывода результата вычисления.
 *
 */

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("sum - ");
        int depositAmount = sc.nextInt();

        System.out.println("period - ");
        int periodAmount = sc.nextInt();

        double rate = 12;
        double percentAmount = depositAmount * periodAmount/365* rate/100;
        System.out.println("percentAmount - " + percentAmount);


    }
}
