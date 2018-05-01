package com.codespace.work2;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 2-5
 *
 * ЗАДАНИЕ:
 * 1. Создайте в проекте PracticalWork2 новый пакет work25, в котором создайте класс Task25.
 * 2. Добавьте в класс Task25 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, который:
 *      − описывает трехзначное целое число number (например, 123);
 *      − находит и выводит на консоль разность между числом number и числом, составленным из его цифр,
 *        но взятых в обратном порядке (например, для 123 обратное число – это 321).
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте арифметические операции для получения результата.
 * 3. Используйте оператор System.out.println(...) для вывода исходных и результирующих значений.
 *
 */

public class Task25 {
    public static void main(String[] args) {
        short number1 = 123;
        short number2 = 3 * 100 + 2 * 10 + 1 * 1;


        if (number1 > number2) {
            System.out.println(number1 - number2);
        } else {
            System.out.println((number2 - number1));
        }

        /** case 2 - solved in class */
        int a1 = 123;
        int a2 = a1 % 10;
        int a3 = a1 / 10 % 10;
        int a4 = a1 / 100;
        int a5 = a4 * 1 + a3 * 10 + a2 * 100;

        System.out.println(a1 + " " + a5);
        System.out.println("result of substraction = " + (a5 - a1));


    }
}
