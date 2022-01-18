package skypro.java.course2.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Bicycle("Bmx", 3));
        vehicles.add(new Car("Audi", 8));
        vehicles.add(new Truck("MAN", 12));

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(vehicles);



    }
}
