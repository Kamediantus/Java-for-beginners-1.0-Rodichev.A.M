public class Main {
    public static void main(String[] args) {
//        Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
        int min = 20;
        int max = -20;
        int[] nums = new int[15];
        int maxModule;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 42 - 21);
            if (min > nums[i]) min = nums[i];
            if (max < nums[i]) max = nums[i];
        }
//        Выведите максимальный и минимальный элемент массива.
        System.out.printf("max: %d\nmin: %d\n", max, min);
//        Из максимального и минимального значения выведите наибольшее по модулю.
        if (min < 0) {
            if (min * (-1) > max) {
                maxModule = min;
            } else maxModule = max;
        } else if (min > max) {
            maxModule = min;
        } else maxModule = max;
        System.out.printf("Большее по модулю: %d", maxModule);
    }
}












