package skypro.java.course2.lesson2;

public class CheckCar implements TransportServiceBehavior{

    @Override
    public void checkTransport() {
        System.out.println("Меняем покрышку");
        System.out.println("Проверяем двигатель");
    }

}
