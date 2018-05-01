package com.codespace.work2;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 2-3
 * ЗАДАНИЕ:
 * 1. Создайте в проекте PracticalWork2 новый пакет work23, в котором создайте класс Task23.
 * 2. Добавьте в класс Task23 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, который вычисляет и выводит расстояние между двумя автомобилями,
 *    движущимися навстречу друг другу, при условии: скорость первого автомобиля speed_1 (например, 90км/ч),
 *    второго — speed_2 (например, 120км/ч), начальное расстояние между ними distance (например, 300 км),
 *    время движения time (например, 1ч).
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте арифметические операции для получения информации.
 * 3. Используйте оператор System.out.println(...) для вывода информации.
 *
 */
public class Task23 {
    public static void main (String[] args) {
        byte speed1 = 90;
        byte speed2 = 120;
        short distance = 300;
        byte time = 1;

        System.out.println("Distance in " + time + " hour(s) is going to be " + (distance - (speed1*time + speed2*time)) + " km");

    }
}
