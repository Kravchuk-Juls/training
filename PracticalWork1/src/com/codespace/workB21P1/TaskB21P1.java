package com.codespace.workB21P1;

import java.util.Scanner;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА Б2_1-1

 ЗАДАНИЕ:
 1. Создайте проект PracticalWorkB2-1 с пакетом workB21P1, в котором
 создайте класс TaskB21P1.
 2. Добавьте в класс TaskB21P1 метод public static int
 convertHexToDecimal(String number), который получает целое
 положительное число number в шестнадцатеричной системе счисления в
 виде строки символов, преобразует его в десятичное число, которое и
 возвращает.
 3. Добавьте в класс TaskВ21Р1 метод public static void main(String[] args),
 который вводит строку символов, представляющую число в
 шестнадцатеричной системе счисления и выводит результат его обработки
 методом convertHexToDecimal().
 4. Запустите приложение на исполнение.
 ТРЕБОВАНИЯ
 1. Приложение должно быть написано на языке Java.
 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
 3. Используйте операторы управления потоком исполнения и методы
 обработки строк.
 4. Используйте метод System.out.println(...) для вывода результата.
 */


public class TaskB21P1 {
    static final int BASE = 16;
    static String digits = "0123456789abcdef";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String str = sc.nextLine().toLowerCase();

        if (validateNumber(str)) {
            int res = convertHexToDecimal(str);
            System.out.println("Result -> " + res);
        } else{
            System.out.println("Invalid String");
        }
    }

    public static int convertHexToDecimal(String number) {
        int result = 0;

        for (int position = number.length()-1; position >= 0; position--) {
            int degree = number.length() - 1 - position;
            char a = number.charAt(position);
            int value = digits.indexOf(a);
            result = result + (int) (value * Math.pow(BASE,degree));
        }

        return result;
    }

    public static boolean validateNumber (String number) {
        for (int pos = 0; pos < number.length(); pos++) {
            if (digits.indexOf(number.charAt(pos)) == -1) {
                return false;
            }
        }

        return true;
    }
}
