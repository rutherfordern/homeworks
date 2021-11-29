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

        // Задача 2 и 3
        printArray(intArray);
        System.out.println(" ");
        printArray(doubleArray);
        System.out.println(" ");
        printArray(stringArray);

        // Задача 4
        System.out.println(" ");
        makeArrayNumberEven(intArray);



    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(" ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (0 < i) {
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

        System.out.println(" ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (0 < i) {
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

        System.out.println(" ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (0 < i) {
                System.out.print(", ");
            }
        }
    }

    public static void makeArrayNumberEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }


}
