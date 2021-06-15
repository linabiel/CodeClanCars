package people;

import vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> vehiclesStock;
    private int till;
    private String name;

    public Dealership(int till, String name) {
        this.vehiclesStock = new ArrayList<>();
        this.till = till;
        this.name = name;
    }

    public ArrayList<Vehicle> getVehiclesStock() {
        return vehiclesStock;
    }

    public String getName() {
        return name;
    }

    public int getVehicleStockSize() {
        return vehiclesStock.size();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehiclesStock.add(vehicle);
    }

    public void buyVehicle(Vehicle vehicle) {
        if (this.till >= vehicle.getPrice()){
        this.till -= vehicle.getPrice();
        addVehicle(vehicle);
        }
    }

    public int getTill() {
        return till;
    }
}
