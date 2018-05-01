package com.codespace.work4;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 4-4
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork4 и добавьте в него пакет work44, в котором создайте класс Task44.
 * 2. Добавьте в класс Task44 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, который выводит в консоль 10 первых чисел, кратных 3 или 4 из диапазона от 1 до 300.
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте вложенные операторы выбора if-else и повторения while для получения результата,
 *    а также оператор перехода break для выхода из цикла.
 * 3. Используйте оператор System.out.println(...) для вывода результата.
 *
 */

public class Task44 {
    public static void main(String[] args) {

        /**case 1 - without break */
        int a = 1;
        int count = 0;
        while (count < 10) {
            int b = a%3;
            int c = a%4;
            if (b == 0 || c == 0) {
                System.out.println(a);
                count++;
            }
            a++;
        }

        /**case 2 - with break */
        int d = 1;
        int count2 = 1;
        outer: while (d<=100) {
            while (d%3 == 0 || d%4 ==0){
                System.out.println(d);
                count2++;
                if (count2 > 10) break outer;
                d++;
            }
            d++;
        }
    }
}
