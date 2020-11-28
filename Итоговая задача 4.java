import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] helpers = new String[]{"2 слова, есть подстрока \"рус\"","Что-то вредное)","сжатый файл","минус пиратства в интернете"};
        boolean helperWasUsed = false;
        int counter = 0;
        String answer;
        String correctAnswer = "Заархивированный вирус";
        String helper = "подсказка";

        System.out.println("Вашему вниманию представляетсязагадка!");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Правила игры: \n- у вас есть 3 попытки.\n- на первой попытке можно использовать подсказку, " +
                "но в таком случае 2 и 3 попытки сгорают.\n- чтобы воспользоваться подсказкой, введите \"Подсказка\"");
        do {

            System.out.print("ответ:");
            answer = in.nextLine();
            if(answer.toLowerCase().equals(helper)){
                if (counter < 1 && !helperWasUsed){
                helperWasUsed = true;
                System.out.println(helpers[(int)(Math.random()*4)]);
                } else {
                    System.out.println("Подсказка уже недоступна.");
                }
                System.out.print("ответ: ");
                answer = in.nextLine();
            }
            if (answer.equalsIgnoreCase(correctAnswer)){
                System.out.println("Правильно!");
                helperWasUsed = true;
            } else {
                System.out.println("Подумай еще!");
            }

            counter ++;
        }
        while (!helperWasUsed && counter < 3);

        if (!(answer.equalsIgnoreCase(correctAnswer))){
            System.out.println("Обидно, приходи в другой раз");
        }
//Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”. Ответ: “Заархивированный вирус”.
//У пользователя есть 3 попытки, чтобы отгадать загадку.
//Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
//Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
//Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
//Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны.
//Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку.
//Если на 2 и 3, вывести “Подсказка уже недоступна”.
//Если пользователь, использовавший подсказку, ошибется,
//вывести “Обидно, приходи в другой раз” и завершить работу.
    }
}













