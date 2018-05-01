package com.codespace.work7;

import java.util.Arrays;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА 7-3
 *
 * ЗАДАНИЕ:
 * 1. Откройте проект PracticalWork7 и добавьте в него пакет work73, в котором создайте класс Task73.
 * 2. Добавьте в класс Task73 метод public static int[][] createMatrix(int size), который создает матрицу
 *    размером size на size и инициализирует ее числами, начиная с 1, двигаясь по столбцам.
 *    Например, матрица размером 4х4 будет иметь следующий вид:
 *      1   5   9   13
 *      2   6   10  14
 *      3   7   11  15
 *      4   8   12  16
 *
 * 3. Добавьте в класс Task73 метод public static void printMatrix(int[][] matrix), который выводит матрицу.
 * 4. Добавьте в класс Task73 метод public static void main(String[] args), который вводит
 *    размерность матрицы, создает ее и затем отображает.
 * 5. Запустите приложение на исполнение.
 *
 * ТРЕБОВАНИЯ
 * 1. Приложение должно быть написано на языке Java.
 * 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
 * 3. Используйте оператор for или for-each для обращения к элементам массива.
 * 4. Используйте метод Arrays.toString() с методом System.out.println(...) для вывода строк массива.
 *
 */


public class work73 {
    public static void main(String[] args) {
        int size = 6;
        int[][] arrayTwo = createMatrix(size);
        printMatrix(arrayTwo);

    }

    public static int[][] createMatrix(int size) {
        if (size <= 0) {
            return new int[0][];
        }

        int[][] myArray = new int[size][size];

        for (int i=0; i <myArray.length; i++) {
            int count = 1;
            for (int j=0; j < myArray[i].length; j++ ) {
                myArray[i][j] = i + count;
                count += size;
            }
        }
        return myArray;
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null || matrix.length <= 0) {
            System.out.println("Invalid matrix");
            return;
        }

        for (int[] row : matrix) {
            if (row==null) {
                System.out.println(row);
            } else {
                System.out.println(Arrays.toString(row));
            }
        }
    }
}
