package com.codespace.work5;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 5-4
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork5 и добавьте в него пакет work54, в котором создайте класс Task54.
 * 2. Добавьте в класс Task54 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, который:
 *      − описываются две переменные myStr1 и myStr2 типа String (например,
 *        со значениями «Cartoon» для первой и «Tomcat» для второй);
 *      − выведите в консоль все буквы, которые присутствуют в первом слове, но отсутствуют во втором.
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте методы charAt(), length(), indexOf() класса String и оператор цикла while для получения результата.
 * 3. Используйте оператор System.out.println(...) для вывода результата.
 *
 */

public class Task54 {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

//        myStr1 = myStr1.toLowerCase();
//        myStr2 = myStr2.toLowerCase();

        int positionChar = 0;

        while (positionChar < myStr1.length()){
            char a = myStr1.charAt(positionChar);
            if (myStr2.indexOf(a) < 0) {
                System.out.println(a);
            }
            positionChar++;
        }

        /** in class */
        int size = myStr1.length();
        int i = 0;
        while (i < size) {
            char ch = myStr1.charAt(i);
            if ( !myStr2.contains("" + ch)){
                System.out.print(ch + "\t");
            }
            i++;
        }
        System.out.println();

    }
}
