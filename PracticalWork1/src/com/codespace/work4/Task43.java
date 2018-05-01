package com.codespace.work4;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 4-3
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork4 и добавьте в него пакет work43, в котором создайте класс Task43.
 * 2. Добавьте в класс Task43 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, который выводит в консоль цифры в следующем порядке:

 1
 2 1
 3 2 1
 4 3 2 1
 5 4 3 2 1
 6 5 4 3 2 1
 7 6 5 4 3 2 1
 8 7 6 5 4 3 2 1

 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте вложенность операторов повторения (циклы) while.
 * 3. Используйте оператор System.out.println(...) для вывода результата.
 *
 */

public class Task43 {
    public static void main(String[] args) {
        int level = 1;
//        System.out.println(level);
//        while (level++ <= 7) {
        while (level <= 7) {
            int value = level ;
            while (value > 0) {
                System.out.print(value + " ");
                value--;
            }
            System.out.println();
            level++;
        }
    }
}
