package com.codespace.work3;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 3-3
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork3 и добавьте в него пакет work33, в котором создайте класс Task33.
 * 2. Добавьте в класс Task33 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, который вычисляет и выводит окончательную стоимость
 *    итальянского шкафа на распродаже, если начальная его стоимость составляла 830.0 $,
 *    затем упала на 13%, а после роста курса евро поднялась на 7%.
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте арифметические операции для вычисления.
 * 3. Используйте оператор System.out.println(...) для вывода результата вычисления.
 *
 */

public class Task33 {
    public static void main(String[] args) {
        double cost = 830;
        double costDecreaseRate = 13.0/100;
        double usdCostIncreaseRate = 7.0/100;
        double result = (cost - (cost * costDecreaseRate)) *(1+usdCostIncreaseRate);
        System.out.println(result);
        System.out.printf("%.2f\n", result);
        System.out.println(String.format("%.2f",result));
    }
}
