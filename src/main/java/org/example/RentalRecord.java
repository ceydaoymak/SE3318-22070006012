package org.example;

/**
 * Holds the rental information for a specific vehicle.
 * Includes renter details, rental duration, and total payment.
 */
public class RentalRecord {

    /**
     * Vehicle being rented.
     */
    private final VehicleAbstract vehicle;

    /**
     * Name of the person who rented the vehicle.
     */
    private final String renterName;

    /**
     * Number of days the vehicle is rented.
     */
    private final int rentalDays;

    /**
     * Total price calculated at the time of rental.
     */
    private final double totalPrice;

    /**
     * Creates a rental record with provided details.
     *
     * @param vehicle     the selected vehicle
     * @param renterName  name of the renter (e.g. "Ceyda Bora")
     * @param rentalDays  rental duration in days
     */
    public RentalRecord(VehicleAbstract vehicle, String renterName, int rentalDays) {
        this.vehicle = vehicle;
        this.renterName = renterName;
        this.rentalDays = rentalDays;
        this.totalPrice = calculateTotalPrice();
    }

    /**
     * Computes total rental cost: daily price × number of days.
     *
     * @return total price for the entire rental period
     */
    private double calculateTotalPrice() {
        return vehicle.getDailyPrice() * rentalDays;
    }

    /**
     * Returns formatted string with complete rental info.
     *
     * @return rental summary in readable format
     */
    @Override
    public String toString() {
        return String.format(
                "%s rented a %s %s (%s) for %d days. Total: $%.2f",
                renterName,
                vehicle.getBrand(),
                vehicle.getModel(),
                vehicle.getLicensePlate(),
                rentalDays,
                totalPrice
        );
    }
}
