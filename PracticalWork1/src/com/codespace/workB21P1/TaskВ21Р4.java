package com.codespace.workB21P1;

import java.util.Scanner;

/**
 *  ПРАКТИЧЕСКАЯ РАБОТА В2_1-4

 ЗАДАНИЕ:
 1. Откройте проект PracticalWorkВ2-1 и добавьте в него пакет workВ21Р4, в
 котором создайте класс TaskВ21Р4.
 2. Добавьте в класс TaskB21P4 метод public static boolean
 countBrackets(String str), который определяет сбалансирована ли строка по
 открывающимся и закрывающимся скобкам (например, строка "((()())())"
 правильна; строка "((()())" или "()))((" не допустимы, т.е. каждой
 открывающей скобке должна быть парная закрывающая скобка).
 3. Добавьте в класс TaskВ21Р4 метод public static void main(String[] args),
 который вводит строку символов, а затем вызовом метода countBrackets()
 проверяет ее валидность и выводит в консоль соответствующее
 сообщение.
 4. Запустите приложение на исполнение.
 ТРЕБОВАНИЯ
 1. Приложение должно быть написано на языке Java.
 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
 3. Используйте операторы управления потоком исполнения и методы
 обработки строк.
 4. Используйте метод System.out.println(...) для вывода результата.
 */


public class TaskВ21Р4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string - ");
        String str = sc.next();

        if (!countBrackets (str)) {
            System.out.println("Invalid string format!");
        } else {
            System.out.println("String is valid!");
        }

    }

    public static boolean countBrackets (String str) {
        int count = 0;
        for (int i=0; i<str.length();i++) {
            char symbol = str.charAt(i);

            if (symbol=='(') { count++; }
            else if (symbol == ')') { count--; }
            else {continue;}

            if (count < 0) { return false; }
        }

        if (count == 0) { return true; }
        return false;
    }
}
