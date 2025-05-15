package org.example;

/**
 * Represents an economy class car.
 * Daily rental cost may increase if the vehicle is hybrid.
 */
public class EconomyCar extends VehicleAbstract {

    /**
     * Flag showing if the car is hybrid.
     */
    private final boolean isHybrid;

    /**
     * Base price per day for economy vehicles.
     */
    private static final double BASE_DAILY_PRICE = 50.0;

    /**
     * Extra daily fee for hybrid cars.
     */
    private static final double HYBRID_SURCHARGE = 10.0;

    /**
     * Constructs a new economy car instance.
     *
     * @param brand        car brand (e.g. Hyundai, Toyota)
     * @param model        car model (e.g. i20, Yaris)
     * @param licensePlate unique plate number
     * @param isHybrid     true if hybrid, false if standard
     */
    public EconomyCar(String brand, String model, String licensePlate, boolean isHybrid) {
        super(brand, model, licensePlate, BASE_DAILY_PRICE);
        this.isHybrid = isHybrid;
    }

    /**
     * Calculates the final daily rental price.
     *
     * @return daily price with hybrid adjustment if applicable
     */
    @Override
    public double getDailyPrice() {
        return isHybrid ? basePrice + HYBRID_SURCHARGE : basePrice;
    }

    /**
     * Returns whether the vehicle is hybrid.
     *
     * @return true if hybrid, false otherwise
     */
    public boolean isHybrid() {
        return isHybrid;
    }
}
