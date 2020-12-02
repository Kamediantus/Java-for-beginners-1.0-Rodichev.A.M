package src.appline.task;

import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strings;
        String str;
        int counter = 0;
//        Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
        System.out.println("Введите вашу строку. Можно использовать и латиницу и кириллицу, не стесняйтесь: ");
        str = in.nextLine();
//        Выведите слова, состоящие только из латиницы.
        strings = str.split("\\s");
        for (int i = 0; i < strings.length; i++){
            if (strings[i].matches("^[a-zA-Z0-9]+$")){
                System.out.println(strings[i]);
                counter ++;
            }
        }
//        Выведите количество этих слов.
        System.out.printf("Количество слов, состоящих только из латинских символов: %d" , counter);
    }
}
