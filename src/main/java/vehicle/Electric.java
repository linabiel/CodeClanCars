package vehicle;

import components.*;

public class Electric extends Vehicle {

    public Electric(int price, String colour, int topSpeed, Tyres tyres, Gearbox gearBox, Stereo stereo, Engine engine) {
        super(price, colour, topSpeed, engine, tyres, gearBox, stereo);
    }

}
