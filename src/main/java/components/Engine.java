package components;

public class Engine {

    private String model;
    private int cylinders;
    private FuelType fuelType;

    public Engine(String model, int cylinders, FuelType fuelType){
        this.model = model;
        this.cylinders = cylinders;
        this.fuelType = fuelType;
    }

    public String getModel() {
        return model;
    }

    public int getCylinders() {
        return cylinders;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
}
