package skypro.java.course1.lesson6;

import java.util.Random;

public class TasksLesson {

    public static int[] array = generateRandomArray();

    public static void main(String[] args) {

        // int[] array = generateRandomArray();

        // Задача 1
        System.out.println("Сумма трат за месяц составила " + calculateMonthlySpend(array) + " рублей.");

        // Задача 2
        getMinMaxSpendDay(array);

        // Задача 3
        calculateAverageMonthlySpend();

        // Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {

        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        return arr;
    }

    public static int calculateMonthlySpend (int[] arrayPayments) {

        int sum = 0;
        for (int value : arrayPayments) {
            sum += value;
        }

        return sum;
    }

    public static void getMinMaxSpendDay (int[] arrayPayments) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int value : arrayPayments) {
            if (value < min) {
                min = value;
            } else if (value > max) {
                max = value;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. "
                          + "Максимальная сумма трат за день составила " + max + " рублей.");

    }

    public static void calculateAverageMonthlySpend () {
        double averageSumMonth = (calculateMonthlySpend(array) * 1.0) / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageSumMonth + " рублей.");
    }
}
