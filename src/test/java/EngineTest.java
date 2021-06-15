import components.Engine;
import components.FuelType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine("RollsRoyce", 12, FuelType.PETROL);
    }

    @Test
    public void hasFuelType() {
        assertEquals(FuelType.PETROL, engine.getFuelType());
    }


}