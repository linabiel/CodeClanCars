import components.*;
import org.junit.Before;
import org.junit.Test;
import people.Dealership;
import vehicle.Petrol;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Petrol petrol;
    Engine engine;
    Tyres tyres;
    Gearbox gearbox;
    Stereo stereo;

    @Before
    public void before() {
        dealership = new Dealership(500000, "Mercedes");
        petrol = new Petrol(25000, "Red", 155, tyres, gearbox, stereo, engine);
        engine = new Engine("MERCEDES1", 8, FuelType.PETROL);
        tyres = new Tyres(4);
        gearbox = new Gearbox("Manual");
        stereo = new Stereo(80);
    }

    @Test
    public void canAddToStock() {
        dealership.addVehicle(petrol);
        assertEquals(1, dealership.getVehicleStockSize());
    }

    @Test
    public void canBuyVehicle() {
        dealership.buyVehicle(petrol);
        assertEquals(1, dealership.getVehicleStockSize());
        assertEquals(475000, dealership.getTill());
    }

}
