package com.codespace.work7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 7-5
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork7 и добавьте в него пакет work75, в котором создайте класс Task75.
 * 2. Добавьте в класс Task75 метод public static int[] countOfSequenceNumbers(String numbers),
 *    который получает последовательность цифр numbers в виде строки символов (символы
 *    из диапазона ['1'– '9']) и подсчитывает в этой последовательности количество единиц,
 *    количество двоек, количество троек и т.д., записывая их в массив.
 * 3. Добавьте в класс Task75 метод public static void main(String[] args), который вводит
 *    строку цифровых символов, обрабатывает ее методом countOfSequenceNumbers() и выводит результат.
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте класс Scanner для ввода строки набором на клавиатуре.
 * 3. Используйте оператор for, for-each, if для обработки строки символов и создания массива целых чисел.
 * 4. Используйте метод Arrays.toString() с методом System.out.println(...) для вывода массива.
 *
 */


public class work75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string with numbers - ");
        String str = sc.nextLine();
        str = updateString(str);
        int[] number = countOfSequenceNumbers(str);
        System.out.println(Arrays.toString(number));
    }

    public static String updateString (String str) {
        if (str == null || str.trim().length() == 0) {
            return null;
        }

        String result = "";
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                result += ch;
            }
        }

        return result;
    }

    public static int[] countOfSequenceNumbers(String numbers) {
        if (numbers == null || numbers.length() == 0) {
            return new int[10];
        }

        int[] result = new int[10];
        for (int index=0; index < numbers.length(); index++) {
            char ch = numbers.charAt(index);
            result[ch - '0']++;
        }

        return result;
    }
}
