package skypro.java.course1.lesson4;

public class TasksLesson {
    public static void main(String[] args) {

        // Задача 1
        printNumbersLoopWhile();
        System.out.println(" ");
        printNumbersLoopFor();
        System.out.println(" ");

        // Задача 2
        calculateFridayInWeek();

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
}
