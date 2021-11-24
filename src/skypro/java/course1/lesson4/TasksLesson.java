package skypro.java.course1.lesson4;

public class TasksLesson {
    public static void main(String[] args) {

        // Задача 1
        printNumbersLoopWhile();
        System.out.println(" ");
        printNumbersLoopFor();
        System.out.println(" ");

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
}
