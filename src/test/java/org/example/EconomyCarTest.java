package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EconomyCarTest {

    @Test
    public void testDailyPriceForHybridCar() {
        EconomyCar car = new EconomyCar("Honda", "Insight", "35CEY1907", true);
        // Expected: base 50 + hybrid extra 10 = 60
        assertEquals(60.0, car.getDailyPrice(), 0.01);
    }

    @Test
    public void testDailyPriceForRegularCar() {
        EconomyCar car = new EconomyCar("Peugeot", "208", "35BRT2025", false);
        // Expected: base 50 + no extras = 50
        assertEquals(50.0, car.getDailyPrice(), 0.01);
    }

    @Test
    public void testHybridFlagIsTrue() {
        EconomyCar car = new EconomyCar("Kia", "Niro", "06NRHY123", true);
        assertTrue(car.isHybrid());
    }

    @Test
    public void testHybridFlagIsFalse() {
        EconomyCar car = new EconomyCar("Opel", "Corsa", "01ANK000", false);
        assertFalse(car.isHybrid());
    }
}
