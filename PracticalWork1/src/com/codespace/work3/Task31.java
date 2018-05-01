package com.codespace.work3;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 3-1
 * ЗАДАНИЕ:
 * 1. Создайте проект PracticalWork3 с пакетом work31, в котором создайте класс Task31.
 * 2. Добавьте в класс Task31 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, который преобразует вес, заданный в фунтах, в килограммы,
 *    но выводит раздельно количество полученных килограмм и грамм (в 1 фунте 405,9 грамм).
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте арифметические операции для вычисления.
 * 3. Используйте оператор System.out.println(...) для вывода результата вычисления.
 *
 */

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input amount of pounds");
        double amountOfPounds = sc.nextDouble();
        final double ONE_POND_CONTAINS_GRAMS = 453.6;
        double amountOfGramsConverted = amountOfPounds * ONE_POND_CONTAINS_GRAMS;
        System.out.println("pounds converted into grams = " + amountOfGramsConverted);

        System.out.println("amount of kilo without decimal part - " + (int) (amountOfGramsConverted / 1000));
        System.out.println("amount of grams without decimal part - " + (int) (amountOfGramsConverted % 1000));
    }
}
