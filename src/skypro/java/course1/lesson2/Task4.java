package skypro.java.course1.lesson2;

public class Task4 {
    public static void main(String[] args) {

        int weightDesired = 7000; // вес в граммах, который необходимо сбросить
        int weightLostPerDay1 = 250; // грамм необходимо сбрасывать в день
        int weightLostPerDay2 = 500; // грамм необходимо сбрасывать в день

        // Подсчет кол-ва дней для похудения
        int totalDays1 = weightDesired / weightLostPerDay1;
        int totalDays2 = weightDesired / weightLostPerDay2;

        System.out.println(totalDays1 + " дней потребуется при похудении на 7 кг, если сбрасывать 250 грамм.");
        System.out.println(totalDays2 + " дней потребуется при похудении на 7 кг, если сбрасывать 500 грамм.");

        // Подсчет среднего количества дней для похудения
        int averageNumberDays = (totalDays1 + totalDays2) / 2;
        System.out.println(averageNumberDays + " дней в среднем потребуется для похудения на 7 кг.");



    }
}
