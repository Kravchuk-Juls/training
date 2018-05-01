package com.codespace.work6;

import java.util.Scanner;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 6-3
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork6 и добавьте в него пакет work63, в котором создайте класс Task63.
 * 2. Добавьте в класс Task63 метод public static char getFirstCharacterOfWord(String str, int numberWord),
 *    который определяет и возвращает первый символ слова под номером numberWord в строке str,
 *    в которой слова разделены только пробелами.
 * 3. Добавьте в класс Task63 метод public static void main(String[] args), который вводит
 *    необходимые данные и выводит результат выполнения метода getFirstCharacterOfWord().
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
 * 3. Используйте методы length(), indexOf() и charAt() класса String для получения результата.
 * 4. Используйте оператор System.out.println(...) для вывода результата.
 *
 */


public class Task63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phrase: ");
        String str = sc.nextLine();

        System.out.print("Enter number of word in phrase: ");
        int numberWord = sc.nextInt();

     //   System.out.println("the first character is:" + getFirstCharacterOfWord(str,numberWord));
        if (getFirstCharacterOfWord(str,numberWord) != 0) {
            System.out.println(String.format("The first character in word #%s is - %c",
                    numberWord, getFirstCharacterOfWord(str, numberWord)));
        }

    }

    public static char getFirstCharacterOfWord(String str, int numberWord) {
//        int firstWord = 1;
//        int positionChar = 0;
//        char result = '0';
//
//        if (numberWord <= 0) {
//            result = '0';
//        } else if (numberWord ==1) {
//            result = str.trim().charAt(0);
//        } else {
//
//        while (firstWord < numberWord) {
//            positionChar = str.indexOf(" ", positionChar) + 1;
//            firstWord++;
//            result = str.charAt(positionChar);
//            }
//         }
//        return result;

        /** in class */

        if (str == null || str.equals("")) {
            System.out.println("Empty string");
         //   System.exit(-1);
            return 0;
        }

        if (numberWord <= 0) {
            System.out.println("Number is not correct");
            return 0;
        }

        char result = '\u0000';
        int currentWord = 1;
        int position = 0;
        while (currentWord != numberWord){
            position = str.indexOf(' ', position);
            if (position < 0 ){
                System.out.println("No word");
                break;
            } else {
                currentWord++;
                position++;
            }

        }

        if (currentWord == numberWord) {
            result = str.charAt(position);
        }

        return result;
    }
}


//        int position = 0;
//        char result=0;
//
//        if (numberWord == 1) {
//            result = str.charAt(0);
//        } else {
//            int a = 1;
//            while (a > 0) {
//                position = str.indexOf(" ", position) + 1;
//                a++;
//                result = str.charAt(position);
//            }
//
//        } return result;
