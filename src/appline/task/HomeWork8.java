package src.appline.task;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
//        Напишите программу, где пользователь вводит любое целое положительное число n.
//        А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
        Scanner in = new Scanner(System.in);
        int num;
        int result = 0;
        System.out.print("Введите положительное целое число:");
        num = in.nextInt();
        for (int i = 1; i <= num; i++){
            if ((i % 2 )!= 0) {
                result += i;
            }
        }
        System.out.println("Вар результат: " + result);
    }
}
