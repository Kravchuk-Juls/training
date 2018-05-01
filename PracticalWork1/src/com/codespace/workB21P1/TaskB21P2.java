package com.codespace.workB21P1;

import java.util.Scanner;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА Б2_1-2

 ЗАДАНИЕ:
 1. Откройте проект PracticalWorkВ2-1 и добавьте в него пакет workВ21Р2, в
 котором создайте класс TaskВ21Р2.
 2. Добавьте в класс TaskВ21Р2 метод public static String
 encodingRealNumbers(double number), который получает вещественное
 число number, кодирует его в строку символов и возвращает полученный
 результат. Кодировка происходит по следующему алгоритму: сначала
 необходимо получить сумму целой и дробной частей числа number, а затем
 заменить каждую цифру суммы на соответствующую ей букву (0 – 'a', 1 –
 'b', 2 – 'c', ..., 8 – 'i', 9 – 'j').
 3. Добавьте в класс TaskВ21Р2 метод public static void main(String[] args),
 который вводит вещественное число, вызывает метод
 encodingRealNumbers() и выводит результат его работы.
 4. Запустите приложение на исполнение.

 Объектно-ориентированное программирование.
 Операторы, методы, строки и массивы

 ТРЕБОВАНИЯ
 1. Используйте класс Scanner для ввода данных набором на клавиатуре.
 2. Используйте операторы управления потоком исполнения и методы
 обработки строк.
 3. Используйте метод System.out.println(...) для вывода результата.
 */


public class TaskB21P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter double digit -> ");
        double number = sc.nextDouble();

        String doubleToString = encodingRealNumbers(number);
        System.out.println("Result -> " + doubleToString);
    }

    public static String encodingRealNumbers(double number) {
        int sum = (int) number;
        String temp = "" + number;
        temp = temp.substring(temp.indexOf(".") + 1);
        sum += Integer.parseInt(temp);
        temp = "" + sum;

        StringBuilder result = new StringBuilder();

        String letters = "abcdefghij";
        for (int position = 0; position < temp.length(); position++) {
            char ch = temp.charAt(position);
            int digit = ch - '0';
            ch = letters.charAt(digit);
            result.append(ch);
        }

        return result.toString();
    }
}
