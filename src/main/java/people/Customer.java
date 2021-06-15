package people;

import vehicle.Vehicle;

import java.sql.Array;
import java.util.ArrayList;

public class Customer {

    private ArrayList<Vehicle> vehiclesCollection;
    private int money;
    private String name;

    public Customer(int money, String name) {
        this.vehiclesCollection = new ArrayList<>();
        this.money = money;
        this.name = name;
    }

    public ArrayList<Vehicle> getVehiclesCollection() {
        return vehiclesCollection;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public int getVehicleCollectionSize() {
        return vehiclesCollection.size();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehiclesCollection.add(vehicle);
    }
}
