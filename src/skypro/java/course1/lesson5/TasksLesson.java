package skypro.java.course1.lesson5;


public class TasksLesson {
    public static void main(String[] args) {

        // Задача 1
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        double[] doubleArray = {1.57, 7.654, 9.986};

        String[] stringArray = {"hello", "world", "xe-xe"};

        // Задача 2
        printArray(intArray);
        System.out.println(" ");
        printArray(doubleArray);
        System.out.println(" ");
        printArray(stringArray);


    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void printArray(double[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void printArray(String[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }


}
