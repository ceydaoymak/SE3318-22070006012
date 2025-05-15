package org.example;

/**
 * Main class to run the car rental system demonstration.
 */
public class App {

    /**
     * Main method – starting point of the application.
     *
     * @param args command-line parameters
     */
    public static void main(String[] args) {

        // Creating a luxury vehicle with GPS and leather seat features
        VehicleAbstract vehicle1 = new LuxuryCar("Mercedes", "GLE", "06ABC321", true, true);

        // Creating an economy vehicle with hybrid functionality
        VehicleAbstract vehicle2 = new EconomyCar("Hyundai", "i20", "34DEF456", true);

        // Generating rental records for the vehicles
        RentalRecord record1 = new RentalRecord(vehicle1, "Ceyda Oymak", 4);
        RentalRecord record2 = new RentalRecord(vehicle2, "Atakan Yıldız", 7);

        // Displaying rental information on the console
        System.out.println(record1);
        System.out.println(record2);
    }
}
