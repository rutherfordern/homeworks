package skypro.java.course1.lesson4;

public class TasksLesson {
    public static void main(String[] args) {

        // Задача 1
        printNumbersLoopWhile();
        System.out.println(" ");
        printNumbersLoopFor();

        // Задача 2
        calculateFridayInWeek();

        // Задача 3
        calculateCometTrajectory();

        // Задача 4 (повышенная сложность)
        printPingPong();

    }

    public static void printNumbersLoopWhile() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }

    public static void printNumbersLoopFor() {
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void calculateFridayInWeek() {
        int friday = 3;
        for (int i = friday; i < 31; i += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void calculateCometTrajectory() {
        int currentYear = 2021;
        int beginYear = currentYear - 200;
        int nextYear = currentYear + 100;

        for (int i = beginYear; i < nextYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printPingPong() {

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else {
                System.out.println(i + ":" + " ");
            }
        }
    }
}
