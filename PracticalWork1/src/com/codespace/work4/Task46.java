package com.codespace.work4;

import java.util.Scanner;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 4-6
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork5 и добавьте в него пакет work46, в котором создайте класс Task46.
 * 2. Добавьте в класс Task45 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, в котором:
 *      – вводится переменная целого типа;
 *      – вычисляется и выводится сумма квадратов цифр введенного числа;
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте new Scanner(System.in) для организации ввода с клавиатуры.
 * 3. Используйте оператор повторения while и арифметические операции.
 * 4. Используйте оператор System.out.println(...) для вывода результата.
 *
 */

public class Task46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num != 0) {
            int mod = num % 10;
            sum = sum + mod * mod;
            num = num / 10;
        }

        System.out.println("sum : " + sum);
    }
}
