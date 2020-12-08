package src.appline.task;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
//        Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
        double num1, num2, result;
        String sign;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        num1 = in.nextDouble();
        System.out.print("Please enter second number: ");
        num2 = in.nextDouble();
        System.out.print("Please enter sign: ");
        sign = in.next();
        System.out.println();
//        В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
        switch (sign){
            case "+": result = num1 + num2;
                System.out.println(result);
                break;
            case "-": result = num1 - num2;
                System.out.println(result);
                break;
            case "*": result = num1 * num2;
                System.out.println(result);
                break;
            case "/":
                if ( num2 == 0) {
                    System.out.println("Сори, на ноль не делим.");
                }
                else {
                result = num1 / num2;
                System.out.println(result);}
                break;
            default:
                System.out.println("Please enter correct sign:");
        }
    }
}
