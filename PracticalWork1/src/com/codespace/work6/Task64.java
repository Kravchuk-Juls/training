package com.codespace.work6;

import java.util.Scanner;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 6-4
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork6 и добавьте в него пакет work64, в котором создайте класс Task64.
 * 2. Добавьте в класс Task64 метод public static String convertDecimalToBinary(int number),
 *    который получает некоторое целое положительное число number, преобразует его в двоичное число
 *    и возвращает в виде строки символов.
 * 3. Добавьте в класс Task64 метод public static void main(String[] args), который вводит целое число
 *    и выводит результат его обработки методом convertDecimalToBinary().
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
 * 3. Используйте арифметические операции, операторы управления потоком исполнения
 *    и класс String для получения результата.
 * 4. Используйте оператор System.out.println(...) для вывода результата.
 *
 */

public class Task64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit: ");
        int number = sc.nextInt();

        String result = convertDecimalToBinary(number);
        System.out.println(result);
    }

    public static String convertDecimalToBinary(int number) {
        String binaryStr = "";

        if (number < 0) {
            number = number * -1;
        } else if (number == 0){
            binaryStr = String.valueOf(number);
        }

        while (number > 0) {
            binaryStr = String.valueOf(number % 2) + binaryStr;
            number /= 2;
        }

        return binaryStr;
    }
}
