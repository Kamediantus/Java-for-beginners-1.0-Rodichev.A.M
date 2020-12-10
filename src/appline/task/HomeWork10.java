package src.appline.task;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        int lines;
        int columns;
//        Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность матрицы. Количество строк: ");
        lines = in.nextInt();
        System.out.print("Количество столбцов: ");
        columns = in.nextInt();
        double [][] nums = new double[lines][columns];

        for (int i = 0; i < lines; i++){
            for (int j = 0; j < columns; j++){
                System.out.printf("Координаты элемента: [%d][%d]. Введите значение элемента:", i, j );
                nums[i][j] = in.nextDouble();
            }
        }
        //                а после этого произведите вывод первой строки матрицы на экран,
        //                где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
        for (int i = 0; i < lines; i++){
            System.out.printf("Элемент [0][%d] * 3 = %.2f\n", i, nums[0][i]*3);
        }
    }
}
