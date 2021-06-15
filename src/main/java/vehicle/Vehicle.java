package vehicle;

import components.Engine;
import components.Tyres;
import components.Gearbox;
import components.Stereo;

public abstract class Vehicle {

    private Engine engine;
    private Tyres tyres;
    private Gearbox gearBox;
    private Stereo stereo;
    private String colour;
    private int topSpeed;
    private int price;

    public Vehicle(int price, String colour, int topSpeed, Engine engine, Tyres tyres, Gearbox gearBox, Stereo stereo) {
        this.price = price;
        this.colour = colour;
        this.topSpeed = topSpeed;
        this.engine = engine;
        this.tyres = tyres;
        this.gearBox = gearBox;
        this.stereo = stereo;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public Gearbox getGearBox() {
        return gearBox;
    }

    public Stereo getStereo() {
        return stereo;
    }

}
