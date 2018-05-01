package com.codespace.work6;

import java.io.Console;
import java.util.Scanner;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 6-2
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork6 и добавьте в него пакет work62, в котором создайте класс Task62.
 * 2. Добавьте в класс Task62 метод public static String latestDigit(int number), который получает
 *    целое число, определяет две последние цифры и возвращает их в виде строки символов в обратном порядке.
 * 3. Добавьте в класс Task62 метод public static void main(String[] args), который вводит
 *    переменную целого типа и выводит результат ее обработки методом latestDigit().
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
 * 3. Используйте арифметические операции, операторы управления потоком исполнения и класс String для получения результата.
 * 4. Используйте оператор System.out.println(...) для вывода результата.
 *
 */


public class Task62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit: ");
        int variable = sc.nextInt();

        System.out.println("Result: " + latestDigit(variable));
    }

    public static String latestDigit(int number) {
        String result = String.valueOf(number);
        int length = result.length();

        if (length >= 2) {
            char a = result.charAt(length-1);
            char b = result.charAt(length-2);
            result = String.valueOf(a) + String.valueOf(b);
        }
        return result;

    }
}
