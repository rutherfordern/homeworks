package skypro.java.course1.lesson6;

import java.util.Random;

public class TasksLesson {
    public static void main(String[] args) {

        int[] array = generateRandomArray();

        // Задача 1
        calculateMonthlyPayments(array);


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

        long sum = 0L;
        for (int elements : arrayPayments) {
            sum += elements;
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }
}
