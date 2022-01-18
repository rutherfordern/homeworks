package skypro.java.course2.lesson2;

public class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        transportServiceBehavior = new CheckTruck();
    }

}
