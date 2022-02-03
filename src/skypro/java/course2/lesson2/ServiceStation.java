package skypro.java.course2.lesson2;

import java.util.List;

public class ServiceStation {

    public void check(List<Vehicle> vehicles) {
        if (vehicles.size() != 0) {
            for (Vehicle vehicle : vehicles) {
                System.out.println();
                System.out.println("Обслуживаем " + vehicle.getModelName() + " в количестве " + vehicle.getWheelsCount()
                        + " единиц.");

                vehicle.transportService();
            }
        }
    }

}
