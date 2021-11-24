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
        for (int friday = 3; friday < 31; friday += 7) {
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
}
