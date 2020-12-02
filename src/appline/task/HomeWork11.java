package src.appline.task;

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num1;
        int num2;

//                Ввести первое  число с клавиатуры и записать его в строковую переменную.
        System.out.print("Введите 1 число: ");
        num1 = in.nextLine();
//                Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        System.out.print("Введите 2 число: ");
        num2 = in.nextInt();
//                Сравнить 2 числа и вывести большее на экран .
//                Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
        if (Integer.parseInt(num1) < num2){
            System.out.printf("Число %d - большее.\n", num2);
            System.out.printf("Число %.2f - меньшее", (double)Integer.parseInt(num1));
        }
        else {
            System.out.printf("Число %d - большее.\n", Integer.parseInt(num1));
            System.out.printf("Число %.2f - меньшее", (double)num2);
        }
    }
}