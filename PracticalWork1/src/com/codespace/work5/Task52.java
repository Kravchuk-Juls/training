package com.codespace.work5;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 5-2
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork5 и добавьте в него пакет work52, в котором создайте класс Task52.
 * 2. Добавьте в класс Task52 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, в котором:
 *      – определяется переменная строкового типа, которая содержит название некоторой
 *        организации из трех слов (например, «National Aviation University»);
 *      – составляет и сохраняет в переменной аббревиатуру этой организации;
 *      – выводит результат в консоль.
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте методы charAt(), indexOf() и lastIndexOf() класса String для получения результата.
 * 3. Используйте оператор System.out.println(...) для вывода результата.
 *
 */

public class Task52 {
    public static void main(String[] args) {
        String name = "National Aviation University";
        String result = "";

        int positionChar = 0;
        while (positionChar >=0) {
            char currentChar = name.charAt(positionChar);
            result = result + currentChar;
         //   System.out.println(result);

            int a = name.indexOf(" ", positionChar);
            if (a > 0) {
                positionChar = a + 1;
            } else {
                positionChar = a;
            }
        }

        System.out.println(result);

        /** in class */
        String name1 = "National Aviation University";
        int positionChar1 = 0;
        String res = "" + name1.charAt(positionChar1);

        while ( (positionChar1 = name1.indexOf(' ', positionChar1))
                > 0) {
            char currentChar1 = name1.charAt(++positionChar1);
            res = res + currentChar1;
        }
        System.out.println(res);
    }
}
