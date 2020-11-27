import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Ввести три числа с клавиатуры x, y, z
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter x:");
        double x = in.nextDouble();
        System.out.println("Please enter y:");
        double y = in.nextDouble();
        System.out.println("Please enter z:");
        double z = in.nextDouble();
//        Найти и вывести в консоль среднее арифметическое этих чисел.
        double avg = (x+y+z)/3;
        System.out.println("Average = " + avg);
//        Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        avg = Math.floor(avg/2);
//        Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (avg > 3) System.out.println("The program works correctly");

    }
}
