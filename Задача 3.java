public class Main {
    public static void main(String[] args) {
//        Задайте массив из 5 любых целых чисел.
        int nums [] = new int[] {1,3,5,7,9};
//        Поменяйте местами первый и последний элемент в массиве.
        int buffer = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length-1] = buffer;
//        Вывести в консоль результат суммы первого и среднего элемента.
        int sum = nums[0] + nums[2];
        System.out.println("Sum = " + sum);
    }
}
