package u;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import c.HybridVehicle;

public class HybridTests {
    HybridVehicle hybrid;

    @Before
    public void setUp() throws Exception{
        hybrid = new HybridVehicle();
    }

    @Test
    public void ElectricTest(){
        double miles = 100.0;
        double kWh = 35;
        hybrid.setMilesfromGas(miles);
        hybrid.setTotalkWh(kWh);
        assertEquals(hybrid.calcMPGe(),96.29,.1);
    }

    @Test
    public void GasTest(){
        double gallons = 5.0;
        double miles = 100.0;
        hybrid.setMilesfromGas(miles);
        hybrid.setGallonsfromGas(gallons);
        assertEquals(hybrid.calcGasMPG(),20.0,.1);
    }

    @Test
    public void HybridTest(){
        double gallons = 5.0;
        double miles = 100.0;
        double kWh = 35;
        hybrid.setMilesfromGas(miles);
        hybrid.setTotalkWh(kWh);
        hybrid.setGallonsfromGas(gallons);
        assertEquals(hybrid.calcAvgMPG(),58.14,.1);
    }
}
