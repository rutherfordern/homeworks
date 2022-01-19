package skypro.java.course2.lesson2;

public class CheckBicycle implements TransportServiceBehavior{

    @Override
    public void checkTransport() {

        System.out.println("Меняем покрышку");
    }

}
