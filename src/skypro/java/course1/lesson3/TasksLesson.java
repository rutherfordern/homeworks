package skypro.java.course1.lesson3;

public class TasksLesson {

    public static void main(String[] args) {

        // Задача 1
        getClientOS();

        // Задача 2
        getClientDeviceYear();

        // Задача 3
        findLeapYear();


    }

    public static void getClientOS() {

        int clientOS = 0;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
    }

    public static void getClientDeviceYear() {

        int clientDeviceYear = 2015;
        int clientOS = 0;

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static void findLeapYear() {

        int year = 2021;

        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }





}
