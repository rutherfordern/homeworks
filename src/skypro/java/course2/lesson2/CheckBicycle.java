package skypro.java.course2.lesson2;

public class CheckBicycle implements TransportServiceBehavior{

    @Override
    public void checkEngine() {
        System.out.println("С двигателем не работаем, на велосипеде его нет.");
    }

    @Override
    public void checkTrailer() {
        System.out.println("С прицепом не работаем, велосипед без прицепа.");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
