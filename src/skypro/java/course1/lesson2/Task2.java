package skypro.java.course1.lesson2;

public class Task2 {
    public static void main(String[] args) {

        float weightFirstBoxer = 78.2f;
        float weightSecondBoxer = 82.7f;

        float totalWeightBoxer = weightFirstBoxer + weightSecondBoxer;
        float differenceWeightBoxer = weightSecondBoxer - weightFirstBoxer;

        System.out.println("Общий вес двух боксеров: " + totalWeightBoxer + " кг.");
        System.out.println("Разница в весе боксеров: " + differenceWeightBoxer + " кг.");

    }
}
