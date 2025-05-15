package org.example;

/**
 * Abstract base class for all vehicle types.
 * Contains shared properties like brand, model, license plate, and base price.
 */
public abstract class VehicleAbstract {

    /**
     * Vehicle brand ( Audi, Toyota).
     */
    protected String brand;

    /**
     * Vehicle model ( Q5, Corolla).
     */
    protected String model;

    /**
     * Unique license plate number.
     */
    protected String licensePlate;

    /**
     * Base daily rental price before any extras.
     */
    protected double basePrice;

    /**
     * Constructor to initialize base vehicle details.
     *
     * @param brand        brand of the vehicle
     * @param model        model of the vehicle
     * @param licensePlate plate number
     * @param basePrice    default daily rental fee
     */
    public VehicleAbstract(String brand, String model, String licensePlate, double basePrice) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.basePrice = basePrice;
    }

    /**
     * Calculates and returns the vehicle's full daily rental cost,
     * including any optional features.
     *
     * @return total daily price
     */
    public abstract double getDailyPrice();

    /**
     * Returns the brand of the vehicle.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Returns the model of the vehicle.
     */
    public String getModel() {
        return model;
    }

    /**
     * Returns the license plate of the vehicle.
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * String representation of the vehicle.
     *
     * @return formatted brand, model, and license plate
     */
    @Override
    public String toString() {
        return brand + " " + model + " (" + licensePlate + ")";
    }
}
