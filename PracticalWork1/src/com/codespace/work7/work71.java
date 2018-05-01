package com.codespace.work7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 7-1
 *
 * ЗАДАНИЕ:
 * 1. Создайте проект PracticalWork7 с пакетом work71, в котором создайте класс Task71.
 * 2. Добавьте в класс Task71 метод public static int[] createArray(int size), создает массив
 *    четных чисел, начиная с 2, размерностью size.
 * 3. Добавьте в класс Task71 метод public static void main(String[] args), который вводит
 *    количество элементов массива, создает массив, используя метод createArray() и выводит его в консоль.
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
 * 3. Используйте оператор for для инициализации массива.
 * 4. Используйте метод Arrays.toString() с методом System.out.println(...) для вывода массива.
 *
 */

public class work71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive integer size: ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.print("Incorrect size value. Enter positive integer size: ");
            size = sc.nextInt();
        }

        int [] array = createArray(size);

        for (int i=0; i < array.length; i++) {
            System.out.println((i+1) + " element of array contains value - " + array[i]);
        }

        System.out.println("Array elements are - " + Arrays.toString(array));

    }

    public static int[] createArray(int size) {

//        if (size <= 0) {
//            return new int[0];
//        }
        int [] array = new int[size];
        int startInt = 0;
        for (int i=0; i < array.length; i++) {
            startInt += 2;
            array[i] = startInt;
        }

//        for (int i=0, value=2; i<array.length; i++, value+=2) {array[i] = value;}
        return array;
    }
}
