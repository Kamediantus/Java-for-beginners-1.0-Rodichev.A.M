import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [] nums;
        double avg = 0;
//            Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        System.out.print("Введите размер массива:");
        nums = new double[in.nextInt()];
        System.out.println("Введите элементы массива, после каждого элемента нажмите enter:");
        for (int i = 0; i < nums.length; i++){
            nums[i] = in.nextDouble();
            avg += nums[i];
        }
//            Посчитайте среднее арифметическое элементов массива.
        avg /= nums.length;
        System.out.println("avg: " + avg);
//            После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        for (int i = 0; i< nums.length; i++){
            System.out.println(nums[i] * avg);
        }

    }
}









