package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class RentalRecordTest {

    @Test
    public void testTotalPriceCalculation() {
        VehicleAbstract vehicle = new EconomyCar("Mazda", "3", "35CEY001", true); // 50 + 10 = 60
        RentalRecord record = new RentalRecord(vehicle, "Ceyda", 4); // 4 * 60 = 240

        String output = record.toString();
        assertTrue(output.contains("Total price: $240.0"));
    }

    @Test
    public void testToStringContent() {
        VehicleAbstract vehicle = new LuxuryCar("Audi", "A6", "34BRT123", false, false); // 100
        RentalRecord record = new RentalRecord(vehicle, "Bora", 5); // 5 * 100 = 500

        String output = record.toString();

        assertTrue(output.contains("Bora rented"));
        assertTrue(output.contains("for 5 days"));
        assertTrue(output.contains("Total price: $500.0"));
    }
}
