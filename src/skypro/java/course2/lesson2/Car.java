package skypro.java.course2.lesson2;

public class Car extends Vehicle{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        transportServiceBehavior = new CheckCar();
    }

}
