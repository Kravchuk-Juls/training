package com.codespace.work5;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 5-1
 *
 * ЗАДАНИЕ:
 * 1. Создайте проект PracticalWork5 с пакетом work51, в котором создайте класс Task51.
 * 2. Добавьте в класс Task51 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, который:
 *      − задает некоторую строку str (например, «The decimal system, invented in India around AD 600,
 *        was a revolution in quantitative reasoning: using only 10 symbols,
 *        even very large numbers could be written down compactly»);
 *      − выводит в консоль вторую ее половину.
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте класс Scanner для организации ввода строки набором на клавиатуре, либо используйте литерал.
 * 3. Используйте методы substring() и length() класса String для получения результата.
 * 4. Используйте оператор System.out.println(...) для вывода результата.
 *
 */

public class Task51 {
    public static void main(String[] args) {
        String str = "The decimal system, invented in India around AD 600, " +
                        "was a revolution in quantitative reasoning: using only 10 symbols,"  +
                        "even very large numbers could be written down compactly";

        System.out.println(str.substring((str.length()-1)/2));

    }
}
