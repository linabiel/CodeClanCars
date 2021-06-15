package components;

public enum FuelType {

    PETROL("Petrol"),
    DIESEL("Diesel"),
    ELECTRIC("Electricity"),
    HYBRID("Mixed");

    private final String fuelType;

    FuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType(){
        return this.fuelType;
    }

}
