import components.*;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicle.Electric;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Electric electric;
    Engine engine;
    Tyres tyres;
    Gearbox gearbox;
    Stereo stereo;

    @Before
    public void before() {
        customer = new Customer(50000, "Giuliano");
        electric = new Electric(20000, "Blue", 130, tyres, gearbox, stereo, engine);
        engine = new Engine("TESLA1", 12, FuelType.ELECTRIC);
        tyres = new Tyres(4);
        gearbox = new Gearbox("Manual");
        stereo = new Stereo(50);
    }

    @Test
    public void canAddToCollection() {
        customer.addVehicle(electric);
        assertEquals(1, customer.getVehicleCollectionSize());
    }
}
