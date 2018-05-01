package com.codespace.work7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 7-2
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork7 и добавьте в него пакет work72, в котором создайте класс Task72.
 * 2. Добавьте в класс Task72 метод public static int sumOddElementsArray(int[] array),
 *    который получает массив целых положительных значений и возвращает сумму нечетных элементов
 *    этого массива или -1, если с массивом что-то не так.
 * 3. Добавьте в класс Task72 метод public static void main(String[] args), который описывает
 *    массив целых положительных чисел, использует метод sumOddElementsArray() и выводит результат его работы.
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте инициализацию массива при объявлении.
 * 3. Используйте операторы управления потоком исполнения для обработки массива.
 * 4. Используйте метод Arrays.toString() с методом System.out.println(...) для вывода массива.
 *
 */

public class work72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive integer size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.print("Incorrect size value. Enter positive integer size: ");
            size = sc.nextInt();
        }

        int[] array = new int[size];
        for (int i=0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        System.out.println("Generated array is " + Arrays.toString(array));
        System.out.println("Sum of odd integers in array is - " + sumOddElementsArray(array));
    }

    public static int sumOddElementsArray(int[] array) {
        if (array == null) {return -1;}
        int sum = 0;
        for (int element : array) {
            if ((element%2) != 0 && element > 0) {
                sum += element;
            } else sum = -1;
        }
        return sum;
    }
}
