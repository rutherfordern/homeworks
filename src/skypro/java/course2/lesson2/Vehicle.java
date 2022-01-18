package skypro.java.course2.lesson2;

public abstract class Vehicle {

    TransportServiceBehavior transportServiceBehavior;

    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }


    public void transportService() {
        transportServiceBehavior.updateTyre();
        transportServiceBehavior.checkEngine();
        transportServiceBehavior.checkTrailer();
    }


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
