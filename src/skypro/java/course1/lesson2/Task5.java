package skypro.java.course1.lesson2;

public class Task5 {

    // Расчет 10% прибавки к зарплате
    public static int calculateSalaryIncrease (int salaryPerson) {
        int number = (salaryPerson / 100) * 10;
        int result = number + salaryPerson;
        return result;
    }

    // Расчет разницы в годовом доходе
    public static int calculateDifferenceAnnualSalary (int annualSalaryPerson1, int annualSalaryPerson2) {
        int result = (annualSalaryPerson1 - annualSalaryPerson2) * 12;
        return result;
    }


    public static void main(String[] args) {

        int salaryMasha, salaryDenis, salaryKristina;
        salaryMasha = 67_760;
        salaryDenis = 83_690;
        salaryKristina = 76_230;

        // Информация о Маше
        int totalSalaryMasha = calculateDifferenceAnnualSalary(calculateSalaryIncrease(salaryMasha),salaryMasha);
        System.out.print("Маша теперь получает " + calculateSalaryIncrease(salaryMasha) + " рублей. ");
        System.out.println("Годовой доход вырос на " + totalSalaryMasha + " рублей.");

        // Информация о Денисе
        int totalSalaryDenis = calculateDifferenceAnnualSalary(calculateSalaryIncrease(salaryDenis),salaryDenis);
        System.out.print("Денис теперь получает " + calculateSalaryIncrease(salaryDenis) + " рублей. ");
        System.out.println("Годовой доход вырос на " + totalSalaryDenis + " рублей.");

        // Информация о Кристине
        int totalSalaryKristina = calculateDifferenceAnnualSalary(calculateSalaryIncrease(salaryKristina),salaryKristina);
        System.out.print("Кристина теперь получает " + calculateSalaryIncrease(salaryKristina) + " рублей. ");
        System.out.print("Годовой доход вырос на " + totalSalaryKristina + " рублей.");


    }

}
