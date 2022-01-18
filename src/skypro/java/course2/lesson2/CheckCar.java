package skypro.java.course2.lesson2;

public class CheckCar implements TransportServiceBehavior{

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("С прицепом не работаем, машина без прицепа.");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}
