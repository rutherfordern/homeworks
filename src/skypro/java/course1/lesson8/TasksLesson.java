package skypro.java.course1.lesson8;

import java.util.Arrays;

public class TasksLesson {
    public static void main(String[] args) {

        // Задача 1
        findLeapYear(2021);

        // Задача 2
        getClientOSAndDeviceYear(0, 2014);

        // Задача 3
        calculateDistanceDelivery(99);

        // Задача 4
        checkDuplicates("bbfdsfsdasdaa");

        // Задача 5
        int[] array = {3, 2, 1, 6, 5};
        reverseArray(array);


    }

    public static void findLeapYear(int year) {

        if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void getClientOSAndDeviceYear(int clientOS, int clientDeviceYear) {

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android/");
        }

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS.");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS.");
        }

    }

    public static void calculateDistanceDelivery(int deliveryDistance) {
        int dayDelivery = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней для доставки: " + dayDelivery);
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней для доставки: " + (dayDelivery + 1));
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней для доставки: " + (dayDelivery + 2));
        } else {
            System.out.println("К сожалению, зона доставки не может быть больше 100 км.");
        }
    }

    public static void checkDuplicates(String duplicateString) {
        char[] strings = duplicateString.toCharArray();
        Arrays.sort(strings);

        for (int i = 1; i < strings.length; i++) {
            if (strings[i - 1] == strings[i]) {
                System.out.println("Найден дублируемый символ: " + strings[i]);
                return;
            }
        }
        System.out.println("Дублируемых символов нет");
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }


}
