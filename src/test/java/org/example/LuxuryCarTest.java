package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class LuxuryCarTest {

    @Test
    public void testDailyPriceWithFullPackage() {
        LuxuryCar car = new LuxuryCar("Porsche", "Panamera", "35BRS1907", true, true);
        // Base 100 + GPS 20 + Leather 30 = 150
        assertEquals(150.0, car.getDailyPrice(), 0.01);
    }

    @Test
    public void testDailyPriceWithBasicModel() {
        LuxuryCar car = new LuxuryCar("Tesla", "Model S", "06CEY2025", false, false);
        // No extras, just base price
        assertEquals(100.0, car.getDailyPrice(), 0.01);
    }

    @Test
    public void testDailyPriceWithGpsOnly() {
        LuxuryCar car = new LuxuryCar("Maserati", "Quattroporte", "34ATA2024", true, false);
        // Base 100 + GPS 20
        assertEquals(120.0, car.getDailyPrice(), 0.01);
    }

    @Test
    public void testDailyPriceWithLeatherOnly() {
        LuxuryCar car = new LuxuryCar("Genesis", "G80", "07DKR707", false, true);
        // Base 100 + Leather 30
        assertEquals(130.0, car.getDailyPrice(), 0.01);
    }

    @Test
    public void testFeatureFlagsAreTrue() {
        LuxuryCar car = new LuxuryCar("Aston Martin", "DB11", "01AST007", true, true);
        assertTrue(car.hasGps());
        assertTrue(car.hasLeatherSeats());
    }

    @Test
    public void testFeatureFlagsAreFalse() {
        LuxuryCar car = new LuxuryCar("Bentley", "Flying Spur", "09BEN888", false, false);
        assertFalse(car.hasGps());
        assertFalse(car.hasLeatherSeats());
    }
}
