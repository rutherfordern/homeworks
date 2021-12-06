package skypro.java.course1.lesson7;

public class TasksLesson {
    public static void main(String[] args) {

        // Задача 1
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";

        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // Задача 2
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName);

    }
}
