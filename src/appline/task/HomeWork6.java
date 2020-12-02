package src.appline.task;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int metrics;
        String metricType;
        int shortMetric;
        double value;
        boolean error = false;
        HashMap<String, Double> lengthMetrics = new HashMap<String, Double>();
        lengthMetrics.put("Метр", 1.0);
        lengthMetrics.put("Миля", 0.000621371);
        lengthMetrics.put("Ярд", 1.09361);
        lengthMetrics.put("Фут", 3.28084);
        Map<Integer, String> lengthShort = new HashMap<Integer, String>();
        lengthShort.put(1, "Метр");
        lengthShort.put(2, "Миля");
        lengthShort.put(3, "Ярд");
        lengthShort.put(4, "Фут");
        HashMap<String, Double> weightMetrics = new HashMap<String, Double>();
        weightMetrics.put("Килограмм", 1.0);
        weightMetrics.put("Стон", 0.157473);
        weightMetrics.put("Фунт", 2.20462);
        weightMetrics.put("Унция", 35.274);
        Map<Integer, String> weightShort = new HashMap<Integer, String>();
        weightShort.put(1, "Килограмм");
        weightShort.put(2, "Стон");
        weightShort.put(3, "Фунт");
        weightShort.put(4, "Унция");
        HashMap<String, Double> chosenMetrics = new HashMap<String, Double>();
        Map<Integer, String> chosenShortMetrics = new HashMap<Integer, String>();

//        1. Пользователю предлагается на выбор ввести массу или расстояние.

        do {
            System.out.print("Что будем конвертировать? 1 - массу, 2 - расстояние:");
            metrics = in.nextInt();
            if (metrics != 1 && metrics != 2) {
                error = true;
                System.out.println("Введите 1 или 2, иначе не заработает.");
            } else error = false;
        }
        while (error);

        if (metrics == 1) {
            chosenMetrics = weightMetrics;
            chosenShortMetrics =weightShort;
        }
        else {
            chosenMetrics = lengthMetrics;
            chosenShortMetrics = lengthShort;
        }

        //        2. Пользователю предлагается выбрать единицу измерения.

        do {
            if (metrics == 2) {
                System.out.println("Исходные еденицы измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            }
            else {
                System.out.println("Исходные еденицы измерения: 1 - килограмм, 2 - стон, 3 - фунт, 4 - унция");
            }
            shortMetric = in.nextInt();
            if (shortMetric != 1 && shortMetric != 2 && shortMetric != 3 && shortMetric != 4) {
                error = true;
                System.out.println("Введите 1, 2, 3 или 4, иначе не заработает.");
            } else error = false;
        }
        while (error);
        metricType = chosenShortMetrics.get(shortMetric);
        System.out.println(metricType);

        //        3. Пользователю предлагается ввести количество выбранных единиц:

        System.out.println("Введите количество едениц: ");
        value = in.nextDouble();

        //                > Результат:

        value = value / chosenMetrics.get(metricType);

        for (HashMap.Entry<String, Double> items : chosenMetrics.entrySet()) {
            System.out.printf("%s : %f\n", items.getKey(), value* items.getValue());
        }
    }
}