package com.codespace.work6;

import java.util.Scanner;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 6-1
 *
 * ЗАДАНИЕ:
 * 1. Создайте проект PracticalWork6 с пакетом work51, в котором создайте класс Task61.
 * 2. Добавьте в класс Task61 метод public static double areaTriangle(double a, double b, double c),
 *    который вычисляет и возвращает значение площади треугольника по формуле Герона:
 *    p ⋅( p − a ⋅() p − b ⋅() p − c) , где a, b, c – стороны треугольника, p – полупериметр.
 * 3. Добавьте в класс Task61 метод public static void main(String[] args), который:
 *    − вводит значения сторон треугольника и выводит площадь треугольника, используя метод areaTriangle().
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
 * 3. Используйте метод Math.sqrt() для вычисления корня квадратного.
 * 4. Используйте оператор System.out.println(...) для вывода результата.
 *
 */

public class Task61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Area of triangle is: " + areaTriangle(a, b, c));
    }

    public static double areaTriangle (double a, double b, double c) {
        double p = (a+b+c)/2;
        double result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return result;
//        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
