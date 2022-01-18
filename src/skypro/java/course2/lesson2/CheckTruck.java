package skypro.java.course2.lesson2;

public class CheckTruck implements TransportServiceBehavior{

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
