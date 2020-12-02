package src.appline.task;

import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
//        Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
//        Пользователь вводит текущий курс и количество рублей.
//        Итоговое значение должно быть округлено до двух знаков после запятой.
        Scanner in = new Scanner(System.in);
        double dollarRate;
        double rubles;

        System.out.print("Введите текущий курс доллара к рублю: ");
        dollarRate = in.nextDouble();
        if (dollarRate > 35){
            System.out.println("Оу... Где мой 2013?(((");}
        System.out.print("Введите количество рублей: ");
        rubles = in.nextDouble();
        System.out.printf("%.2f руб. в долларах = %.2f$ при курсе %.2f", rubles, rubles/dollarRate, dollarRate);

    }
}