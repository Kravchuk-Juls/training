package com.codespace.work5;

import java.util.Scanner;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 5-5
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork5 и добавьте в него пакет work55, в котором создайте класс Task55.
 * 2. Добавьте в класс Task55 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, который:
 *      − вводит некоторую строку;
 *      − выводит в консоль все уникальные символы этой строки.
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте методы charAt(), length(), indexOf() и lastIndexOf() класса String
 *    и оператор цикла while для получения результата.
 * 3. Используйте оператор System.out.println(...) для вывода результата.
 *
 */

public class Task55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String entered = sc.nextLine();

//for test        String entered = "An ordinary child had the habit to play around";

        int positionChar = 0;
        while (positionChar < entered.length()){
            char a = entered.charAt(positionChar);
            if (entered.indexOf(a) == entered.lastIndexOf(a)) {
                System.out.print(a);
            }
            positionChar++;
        }

        /** alternative solving case*/
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int length = string.length();
        int counter = 0;
        String result = "";
        while (counter <= length){
            char symbol = string.charAt(counter);
            if (result.indexOf(symbol) == -1){
                result = result + symbol;
            }
            counter++;
        }
        System.out.println(result);


    }
}
