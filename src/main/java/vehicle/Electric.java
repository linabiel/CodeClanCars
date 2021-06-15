package vehicle;

import components.Engine;
import components.Tyres;
import components.Gearbox;
import components.Stereo;

public class Electric extends Vehicle {

    public Electric(int price, String colour, int topSpeed, Engine engine, Tyres tyres, Gearbox gearBox, Stereo stereo) {
        super(price, colour, topSpeed, engine, tyres, gearBox, stereo);
    }

}
