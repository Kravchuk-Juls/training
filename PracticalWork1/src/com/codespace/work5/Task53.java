package com.codespace.work5;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 5-3
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork5 и добавьте в него пакет work53, в котором создайте класс Task63.
 * 2. Добавьте в класс Task63 метод public static void main(String[] args) { }.
 * 3. Добавьте в метод main(...) код, в котором:
 *      − определяется переменная строкового типа, содержащая несколько слов (например,
 *        «An information system is designed to collect, process, store and distribute information»);
 *      – меняются местами первое и последнее слова этой строки;
 *      – выводится результат в консоль.
 * 4. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте методы substring(), length(), indexOf() и lastIndexOf() класса String для получения результата.
 * 3. Используйте оператор System.out.println(...) для вывода результата.
 *
 */

public class Task53 {
    public static void main(String[] args) {
        String str = "An information system is designed to collect, process, store and distribute information";
        String firstWord = str.substring(0, str.indexOf(" "));
        String lastWord = str.substring(str.lastIndexOf(" ")+1);

        int strLength = str.length();
        int firstWordLenght = firstWord.length();
        int lastWordLength = lastWord.length();

        System.out.println(lastWord
                            + str.substring(firstWordLenght,(strLength - lastWordLength))
                            + firstWord);


        /** in class */
        String str2 = "    An information system is designed " +
                "to collect, process, store and distribute " +
                "information   ";
        str2 = str2.trim();
        int posSpace1 = str2.indexOf(" ");
        int posSpace2 = str2.lastIndexOf(" ");
        String newStr = str2.substring(posSpace2+1) +
                str2.substring(posSpace1, posSpace2+1) +
                str2.substring(0, posSpace1);
        System.out.println(newStr);

    }
}
