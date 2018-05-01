package com.codespace.workB21P1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ПРАКТИЧЕСКАЯ РАБОТА Б2_1-3

 ЗАДАНИЕ:
 1. Откройте проект PracticalWorkВ2-1 и добавьте в него пакет workВ21Р3, в
 котором создайте класс TaskВ21Р3.
 2. Добавьте в класс TaskВ21Р3 метод public static void
 permutationRowsAndColumnsMatrix(int[][] matrix, int row, int column),
 который находит в матрице минимальный элемент и меняет его местами с
 указанным элементом matrix[row][column] путем последовательной
 перестановки их строк и столбцов.
 3. Добавьте в класс TaskВ21Р3 метод public static int[][] createMatrix(int
 size), который создает матрицу размером size на size и инициализирует ее
 случайными значениями.
 4. Добавьте в класс TaskВ21Р3 метод public static void printMatrix(int[][]
 matrix), который выводит матрицу.
 5. Добавьте в класс Task7В21Р3 метод public static void main(String[] args),
 который вводит размерность матрицы, создает и отображает ее, затем
 вводит позицию элемента матрицы и вызывает метод
 permutationRowsAndColumnsMatrix() для обработки матрицы, после чего
 отображает ее в консоль.
 6. Запустите приложение на исполнение.
 ТРЕБОВАНИЯ
 1. Приложение должно быть написано на языке Java.
 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
 3. Используйте управления потоком исполнения для обработки матрицы.
 4. Используйте метод Arrays.toString() с методом System.out.println(...) для
 вывода строк массива.
 */

public class TaskB2P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix -> ");
        int size = sc.nextInt();

        int[][] arraysTwo = createMatrix(size);
        System.out.println("Initial matrix: ");
        printMatrix(arraysTwo);

        System.out.println("Enter row and column -> ");
        permutationRowsAndColumnsMatrix(arraysTwo, sc.nextInt(), sc.nextInt());

        System.out.println("-------------------------------");
        printMatrix(arraysTwo);

    }

    public static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i=0; i<size; i++) {
            for (int j=0;j<size; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row: matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void permutationRowsAndColumnsMatrix(int[][] matrix, int row, int column) {
        int min = matrix[0][0];
        int rowMin = 0;
        int columnMin = 0;
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length;j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    rowMin = i;
                    columnMin = j;
                }
            }
        }
        System.out.println("---------------");
        System.out.println("min = " + min + "\trow = " + rowMin + "\tcolumn = " + columnMin);

        int direct = -1;

        if (rowMin < row) {
            direct = -direct;
        }

        for (int count=rowMin; count!=row; count+=direct) {
            int[] temp = matrix[count];
            matrix[count] = matrix[count+direct];
            matrix[count+direct] = temp;
        }

    }
}
