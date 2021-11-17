package skypro.java.course1.lesson2;

public class Task3 {
    public static void main(String[] args) {

        // Состав завтрака (продукты)
        int bananas, milk, icecream, eggs;
        bananas = 5;
        milk = 200; // в миллилитрах
        icecream = 2;
        eggs = 4;

        // Вес отдельного продукта в граммах
        int weightBanana = 80;
        int weightIceCream = 100; // 1 брикет = 100 гр
        int weightEgg = 70;

        // Общий вес продуктов в граммах
        int totalWeightBananas = bananas * weightBanana;
        double totalWeightMilk = milk * 0.95; // 100 гр = 105 мл
        int totalWeightIceCream = icecream * weightIceCream;
        int totalWeightEggs = eggs * weightEgg;

        // Вес целого завтрака в граммах
        double totalWeightGram = totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightEggs;
        System.out.println("Вес завтрака спортсмена в граммах: " + totalWeightGram);

        // Вес целого завтрака в килограммах
         double totalWeightKiloGram = totalWeightGram / 1000;
        System.out.println("Вес завтрака спортсмена в килограммах: " + totalWeightKiloGram);




    }
}
