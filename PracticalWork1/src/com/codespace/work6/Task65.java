package com.codespace.work6;

import java.util.Scanner;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 6-5
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork6 и добавьте в него пакет work65, в котором создайте класс Task65.
 * 2. Добавьте в класс Task65 метод public static void printPyramid(int height),
 *    который создает и выводит на консоль пирамиду высотой height (значение в диапазоне от 1 по 9).
 *    Например, для height = 4:
 *
 *              1
 *             121
 *            12321
 *           1234321
 *
 *  3. Добавьте в класс Task65 метод public static void main(String[] args), который вводит высоту пирамиды
 *     и выводит пирамиду с использованием метода printPyramid().
 *  4. Запустите приложение на исполнение.
 *
 *  ТРЕБОВАНИЯ
 *  1. Приложение должно быть написано на языке Java.
 *  2. Используйте операторы управления потоком исполнения для получения результата.
 *  3. Используйте оператор System.out.println(...) для вывода результата.
 *
 */

public class Task65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pyramid height: ");
        printPyramid(sc.nextInt());
    }

    public static void printPyramid(int height) {

        if (height <= 0 || height > 9) {
            System.out.println("Incorrect pyramid height!");
            return;
        }

        int level = 1;
        while (level <= height) {
            int value = 1;

            int spaces = height - level;
            while (spaces > 0) {
                System.out.print(" ");
                spaces--;
            }

            while (value <= level) {
                System.out.print(value++);
            }

            value = level;
            while (value > 1) {
                System.out.print(--value);
            }

            System.out.println();
            level++;
        }
    }
}
