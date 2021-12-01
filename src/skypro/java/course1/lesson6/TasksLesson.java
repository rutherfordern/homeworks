package skypro.java.course1.lesson6;

import java.util.Random;

public class TasksLesson {
    public static void main(String[] args) {

        int[] array = generateRandomArray();

        // Задача 1
        calculateMonthlyPayments(array);

        // Задача 2
        getMinMaxSpendDay(array);



    }

    public static int[] generateRandomArray() {

        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        return arr;
    }

    public static void calculateMonthlyPayments (int[] arrayPayments) {

        int sum = 0;
        for (int value : arrayPayments) {
            sum += value;
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void getMinMaxSpendDay (int[] arrayPayments) {

        int min = Integer.MAX_VALUE;
        for (int value : arrayPayments) {
            if (value < min) {
                min = value;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int value : arrayPayments) {
            if (value > max) {
                max = value;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. "
                          + "Максимальная сумма трат за день составила " + max + " рублей.");

    }
}
