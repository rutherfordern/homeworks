package skypro.java.course1.lesson2;

public class Task5 {

    // Расчет 10% прибавки к зарплате
    public static int calculateSalaryIncrease (int salaryPerson) {
        int number = (salaryPerson / 100) * 10;
        int result = number + salaryPerson;
        return result;
    }

    // Расчет разницы в годовом доходе
    public static int calculateDifferenceAnnualSalary (int newSalary, int basicSalary) {
        return  (newSalary - basicSalary) * 12;
    }


    public static void main(String[] args) {

        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;

        // Информация о Маше
        int totalSalaryMasha = calculateSalaryIncrease(salaryMasha);
        System.out.print("Маша теперь получает " + totalSalaryMasha + " рублей. ");
        int annualSalaryMasha = calculateDifferenceAnnualSalary(totalSalaryMasha,salaryMasha);
        System.out.println("Годовой доход вырос на " + annualSalaryMasha + " рублей.");

        // Информация о Денисе
        int totalSalaryDenis = calculateSalaryIncrease(salaryDenis);
        System.out.print("Денис теперь получает " + totalSalaryDenis + " рублей. ");
        int annualSalaryDenis = calculateDifferenceAnnualSalary(totalSalaryDenis,salaryDenis);
        System.out.println("Годовой доход вырос на " + annualSalaryDenis + " рублей.");

        // Информация о Кристине
        int totalSalaryKristina = calculateSalaryIncrease(salaryKristina);
        System.out.print("Кристина теперь получает " + totalSalaryKristina + " рублей. ");
        int annualSalaryKristina = calculateDifferenceAnnualSalary(totalSalaryKristina, salaryKristina);
        System.out.print("Годовой доход вырос на " + annualSalaryKristina + " рублей.");


    }

}
