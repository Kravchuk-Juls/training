package com.codespace.work4;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 4-5
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork5 и добавьте в него пакет work45, в котором создайте класс Task45.
 * 2. Добавьте в класс Task45 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, который строит и выводит в консоль таблицу умножения чисел от 1 по 9 в следующем виде:

 * | 1 2 3 4 5 6 7 8 9
 --------------------------------------
 1 | 1 2 3 4 5 6 7 8 9
 2 | 2 4 6 8 10 12 14 16 18
 3 | 3 6 9 12 15 18 21 24 27
 4 | 4 8 12 16 20 24 28 32 36
 5 | 5 10 15 20 25 30 35 40 45
 6 | 6 12 18 24 30 36 42 48 54
 7 | 7 14 21 28 35 42 49 56 63
 8 | 8 16 24 32 40 48 56 64 72
 9 | 9 18 27 36 45 54 63 72 81

 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте вложенные операторы повторения while для вычисления результата.
 * 3. Используйте оператор System.out.println(...) для вывода результата.
 *
 */

public class Task45 {
    public static void main(String[] args) {
        int num = 1;

        System.out.println("* | 1 2 3 4 5 6 7 8 9");
        System.out.println("----------------------------------");

        while (num <=9) {
            int multi = 1;
            System.out.print(num + " | ");

            while (multi <= 9) {
                int result = multi * num;
                System.out.print(result + " ");
                multi++;
            }

            System.out.println();
            num++;
        }

        /**case 2 - in class */
        int counter = 1;
        System.out.print("* | ");
        while (counter <= 9 ) {
            System.out.printf("%4d", counter);
            counter++;
        }
        System.out.println();

        counter = 0;
        while (counter <= 9) {
            System.out.print("----");
            counter++;
        }
        System.out.println();

        int number1 = 1;
        while (number1 <= 9) {
            int number2 = 1;
            System.out.print(number1 + " | ");
            while (number2 <= 9) {
                System.out.printf("%4d", number1 * number2);
                number2++;
            }
            System.out.println();
            number1++;
        }
    }
}
