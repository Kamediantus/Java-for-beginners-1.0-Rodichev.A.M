package src.appline.task;

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "I like Java!!!";
        boolean allRight[] = new boolean[]{false,false,false};
//        Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
//        Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        allRight[0] = str.contains("Java");
        System.out.println("Содержит подстроку \"Java\": " + allRight[0]);

//        Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
        allRight[1] = str.startsWith("I like");
        System.out.println("Начинается с подстроки \"I like\": " + allRight[1]);

//        Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        allRight[2] = str.endsWith("!!!");
        System.out.println("Заканчивается подстрокой \"!!!\": " + allRight[2]);

//        Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        if (allRight[0] && allRight[1] && allRight[2]){
            System.out.println(str.toUpperCase());
        }
//        Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).
        str = str.replaceAll("a", "o");
        System.out.println(str.substring(7,11));
    }
}