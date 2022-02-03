package skypro.java.course2.lesson2;

public class Bicycle extends Vehicle{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        transportServiceBehavior = new CheckBicycle();
    }


}
