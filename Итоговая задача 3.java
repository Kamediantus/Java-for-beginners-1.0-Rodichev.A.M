import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
//        Среди данных строк найти строку с максимальным количеством различных символов.
//        Если таких строк будет много, то вывести первую.
        int maxSpells = 0;
        int numOfLongerWord = 0;
        Scanner in = new Scanner(System.in);
        String [] strings;

        System.out.print("Введите желаемое число строк: ");
        strings = new String[in.nextInt()];

        System.out.println("Вводите каждую строку, разделяя их переносом строки (enter): ");
        for (int i = 0; i < strings.length; i++){
            strings[i] = in.next();
            if (countUniqueCharacters(strings[i]) > maxSpells){
                numOfLongerWord = i;
                maxSpells = countUniqueCharacters(strings[i]);
            }
        }
        System.out.println("Строка с наибольшим числом уникальных символов: " + strings[numOfLongerWord]);
    }

    public static int countUniqueCharacters(String s) {
        String lowerCase = s.toLowerCase();
        char characters[] = lowerCase.toCharArray();
        int countOfUniqueChars = s.length();
        for (int i = 0; i < characters.length; i++) {
            if (i != lowerCase.indexOf(characters[i])) {
                countOfUniqueChars--;
            }
        }
        return countOfUniqueChars;
    }
}













