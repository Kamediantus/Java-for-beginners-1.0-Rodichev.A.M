package src.appline.task;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrayLength;
        int [] xyz = new int[]{(int) (100 * Math.random()),(int) (100 * Math.random()),(int) (100 * Math.random())};
        boolean win = false;


//        Пользователь вводит размер массива и данные с клавиатуры в массив
        System.out.print("Введите размер массива: ");
        arrayLength = in.nextInt();
        int [] array = new int[arrayLength];
        System.out.println("Загаданные числа находятся в диапазоне от 1 до 100");
        System.out.println("Введите числовые значения элементов массива, после каждого элемента нажмите enter");
        for (int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }

//        Сравнить элементы массива с заранее заданными константами x, y, z.
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < xyz.length; j++){
                if (array[i] == xyz[j]){
                    win = true;
                    //Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
                    System.out.println("Данное значение имеется в константах: " + array[i]);
                }
            }
        }
        if (!win) System.out.println("Вы не угадали ни одного числа(((");

        System.out.println("Загаданные числа: ");
        for (int i = 0; i < xyz.length; i++){
            System.out.println(xyz[i]);
        }
    }
}
