package org.example;

/**
 * Represents a luxury-class vehicle.
 * Additional daily fees apply if the car includes GPS or leather seats.
 */
public class LuxuryCar extends VehicleAbstract {

    /**
     * True if the car includes GPS.
     */
    private final boolean hasGps;

    /**
     * True if the car includes leather seats.
     */
    private final boolean hasLeatherSeats;

    /**
     * Standard daily price for all luxury cars.
     */
    private static final double BASE_DAILY_PRICE = 100.0;

    /**
     * Extra cost for GPS per day.
     */
    private static final double GPS_FEE = 20.0;

    /**
     * Extra cost for leather seats per day.
     */
    private static final double LEATHER_SEAT_FEE = 30.0;

    /**
     * Constructs a luxury car instance with optional features.
     *
     * @param brand        car brand (e.g. Audi, BMW)
     * @param model        car model (e.g. A6, X5)
     * @param licensePlate car plate number (e.g. 35BORA2025)
     * @param hasGps       true if GPS is included
     * @param hasLeather   true if leather seats are included
     */
    public LuxuryCar(String brand, String model, String licensePlate, boolean hasGps, boolean hasLeather) {
        super(brand, model, licensePlate, BASE_DAILY_PRICE);
        this.hasGps = hasGps;
        this.hasLeatherSeats = hasLeather;
    }

    /**
     * Calculates and returns the final daily rental fee.
     *
     * @return total daily rental price
     */
    @Override
    public double getDailyPrice() {
        double price = basePrice;
        if (hasGps) price += GPS_FEE;
        if (hasLeatherSeats) price += LEATHER_SEAT_FEE;
        return price;
    }

    /**
     * Checks if GPS is included.
     *
     * @return true if GPS is available
     */
    public boolean hasGps() {
        return hasGps;
    }

    /**
     * Checks if leather seats are included.
     *
     * @return true if leather seats are available
     */
    public boolean hasLeatherSeats() {
        return hasLeatherSeats;
    }
}
