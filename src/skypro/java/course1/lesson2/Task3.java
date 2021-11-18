package skypro.java.course1.lesson2;

public class Task3 {
    public static void main(String[] args) {

        // Состав завтрака (продукты)
        int bananasNumber = 5;
        int milkMlVolume  = 200; // в миллилитрах
        int iceCreamNumber = 2;
        int eggsNumber = 4;

        // Вес отдельного продукта в граммах
        int weightBanana = 80;
        int weightIceCream = 100; // 1 брикет = 100 гр
        int weightEgg = 70;

        // Общий вес продуктов в граммах
        int totalWeightBananas = bananasNumber * weightBanana;
        double totalWeightMilk = (milkMlVolume / 100) * 105; // 100 гр = 105 мл
        int totalWeightIceCream = iceCreamNumber * weightIceCream;
        int totalWeightEggs = eggsNumber * weightEgg;

        // Вес целого завтрака в граммах
        double totalWeightGram = totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightEggs;
        System.out.println("Вес завтрака спортсмена в граммах: " + totalWeightGram);

        // Вес целого завтрака в килограммах
         double totalWeightKiloGram = totalWeightGram / 1000;
        System.out.println("Вес завтрака спортсмена в килограммах: " + totalWeightKiloGram);




    }
}
